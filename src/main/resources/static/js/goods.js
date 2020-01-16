var title = "";
var url = "";
var $;
var layer;
layui.use([ 'jquery', 'table', 'layer', 'form', 'laydate' ], function() {
	// 加载layui模块，使用其推荐的【预先加载】方式，详见官网【模块规范】一节
	$ = layui.$;
	var table = layui.table;
	layer = layui.layer;
	var form = layui.form;
	var laydate = layui.laydate;
	// 记录选中的数据:做缓存使用,作为参数传递给后台
	//用于加载日期选择框
	laydate.render({
		elem: '#search_endDate' //或 elem: document.getElementById('test')、elem: lay('#test') 等
	});
	var ids = new Array();
	// 当前表格中的全部数据:在表格的checkbox全选的时候没有得到数据, 因此用全局存放变量
	var table_data = new Array();
	// 显示所有学生
	table.render({
		elem : '#test',
		url : '/goods/queryByPage',
		method : 'post',
		page : true,
		toolbar : '#toolbarDemo',
		defaultToolbar : [ 'filter', 'exports', 'print', { // 自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
			title : '提示',
			layEvent : 'LAYTABLE_TIPS',
			icon : 'layui-icon-tips'
		} ],
		// height : $(document).height() - $('#goods-tbl').offset().top
		// - 20,
		height : 'full-68',
		cols : [ [ {
			type : 'checkbox',
			fixed : 'left'
		}, {
			field : 'goodsName',
			title : '货物名称'
		}, {
			field : 'goodsInformation',
			title : '货物信息'
		}, {
			field : 'goodsWeight',
			title : '货物重量'
		}, {
			field : 'goodsAddressee',
			title : '收件人'
		}, {
			field : 'orderId',
			title : '订单编号'
		}, {
			field : 'senderId',
			title : '发货人编号'
		}, {
			fixed : 'right',
			title : '操作',
			toolbar : '#barDemo',
			width : 150
		} ] ],
		// 表格容器id，用于表格重载
		id : 'test',
		
		done : function(res, curr, count) {
			// 数据表格加载完成时调用此函数
			// 如果是异步请求数据方式，res即为你接口返回的信息。
			// 如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
			if (res.count == 0) { // 没有查询到数据隐藏分页栏
				$(".layui-none").hide(); // 隐藏无数据
				$(".layui-table-page").hide(); // 隐藏分页
			} else {
				// 设置全部数据到全局变量
				table_data = res.data;

				// 在缓存中找到id ,然后设置data表格中的选中状态
				// 循环所有数据，找出对应关系，设置checkbox选中状态
				for (var i = 0; i < res.data.length; i++) {
					for (var j = 0; j < ids.length; j++) {
						// 数据id和要勾选的id相同时checkbox选中
						if (res.data[i].goodsId == ids[j]) {
							// 这里才是真正的有效勾选
							res.data[i]["LAY_CHECKED"] = 'true';
							// 找到对应数据改变勾选样式，呈现出选中效果
							var index = res.data[i]['LAY_TABLE_INDEX'];
							$(
									'.layui-table tr[data-index=' + index
											+ '] input[type="checkbox"]').prop(
									'checked', true);
							$(
									'.layui-table tr[data-index=' + index
											+ '] input[type="checkbox"]')
									.next().addClass('layui-form-checked');
						}
					}
				}
				// 设置全选checkbox的选中状态，只有改变LAY_CHECKED的值，
				// table.checkStatus才能抓取到选中的状态
				var checkStatus = table.checkStatus('goods-tbl');
				if (checkStatus.isAll) {
					$('.layui-table th[data-field="0"] input[type="checkbox"]')
							.prop('checked', true);
					$('.layui-table th[data-field="0"] input[type="checkbox"]')
							.next().addClass('layui-form-checked');
				}
			}
		}
	});
	// 头工具栏事件
	table.on('toolbar(test)', function(obj) {
		var checkStatus = table.checkStatus(obj.config.id);
		switch (obj.event) {
		case 'add-goods-btn':
			// 每次显示前重置表单
			$('#goods-form')[0].reset();
			// 清空表单中id值
			$("input[name='goodsId']").val('');
			title = "添加学生";
			url = "add";
			openDialog();
			break;
		// 删除
		case 'delete-goods-btn':
			if (ids.length > 0) {
				layer.confirm("确定删除选中的" + ids.length + "条数据吗？", {
					icon : 3,
					title : '提示信息'
				}, function(index) {

					$.ajax({
						url : "/goods/deleteMore",
						type : "POST",
						data : "ids=" + ids.join(),
						dataType : 'json',
						success : function(data) {
							if (data.statue == 0) {
								layer.close(index);
								layer.msg(data.msg);
								table.reload('test');
							} else {
								layer.msg('删除失败');
							}
						}
					});

				})
			} else {
				layer.msg("请选择需要删除的记录");
			}
			break;
		// 自定义头工具栏右侧图标 - 提示
		case 'LAYTABLE_TIPS':
			layer.alert('这是工具栏右侧自定义的一个图标按钮');
			break;
		}
		;
	});

	// 监听行工具事件（操作栏监听）
	table.on('tool(test)', function(obj) {
		var data = obj.data;
		var event = obj.event;
		// console.log(obj)
		if (event === 'del') {
			layer.confirm('确定删除该学生吗？', function(index) {
				// ajax方式删除学生
				$.ajax({
					url : '/goods/deleteMore',
					type : "post",
					data : 'ids=' + data.goodsId,
					dataType : 'json',
					success : function(data) {
						if (data.statue == 0) {
							layer.msg(data.msg);
							table.reload('goods-tbl');
						} else {
							layer.msg('删除失败');
						}
						table.reload('test');
					},
					error : function() {
						console.log("ajax error");
					}
				});
				layer.close(index);
			});
		} else if (event === 'edit') {
			layer.prompt({
				formType : 2,
				value : data.email
			}, function(value, index) {
				obj.update({
					email : value
				});
				layer.close(index);
			});
		} else if (event === 'update-goods') {
			form.val('goods-form', {
				"goodsId" : data.goodsId,
				"goodsName" : data.goodsName,
				"goodsInformation" : data.goodsInformation,
				"goodsWeight" : data.goodsWeight,
				"goodsAddressee" : data.goodsAddressee,
				"orderId" : data.orderId,
				"senderId" : data.senderId
			});
			title = "更新用户";
			url = "update";
			openDialog();
		}
	});
	// 复选框选中监听,将选中的id 设置到缓存数组,或者删除缓存数组
	table.on('checkbox(test)', function(obj) {
		if (obj.checked) {
			if (obj.type == 'one') { // 单个复选框
				if (!isExist(obj.data.goodsId, ids)) {
					ids.push(obj.data.goodsId);
				}
			} else { // 全选复选框
				for (var i = 0; i < table_data.length; i++) {
					if (!isExist(table_data[i].goodsId, ids)) { // 数组中不存在，则添加
						ids.push(table_data[i].goodsId);
					}
				}
			}
		} else {
			if (obj.type == 'one') {
				for (var i = 0; i < ids.length; i++) {
					if (ids[i] == obj.data.goodsId) {
						ids.splice(i, 1);
					}
				}
			} else {
				for (var i = 0; i < ids.length; i++) {
					for (var j = 0; j < table_data.length; j++) {
						if (ids[i] == table_data[j].goodsId) {
							ids.splice(i, 1);
							i--; // 删除的时候数组长度也在动态变化
							break;
						}
					}
				}
			}
		}
	});
	
	// 添加学生表单提交
	form.on('submit(goods-form-submit)', function(data) {
		// ajax方式添加学生
		$.ajax({
			url : "/goods/" + url,
			type : "POST",
			data : data.field,
			// contentType: 'application/json',
			dataType : 'json',
			success : function(data) {
				if (data.statue == 0) {
					layer.close(layer.index);
					layer.msg(data.msg);
					table.reload('test');
				} else {
					layer.msg('添加失败');
				}
			},
			error : function() {
				console.log("ajax error");
			}
		});
		// 阻止表单跳转
		return false;
	});

	//搜索按钮
	$("#search_btn").click(function() {
		table.reload('test', {
			url : "/goods/queryByPage",
			where : {
				waybillNo : $('#search_waybillNo').val(),
				wPhone : $('#search_wPhone').val()
			},
			page : {
				curr : 1
			}
		});
	});
});

function openDialog() {
	// 显示更新学生表单的弹出层
	layer.open({
		type : 1,
		title : title,
		skin : 'layui-layer-molv',
		area : [ '500px' ],
		content : $('#goods-layer')
	});
}
// 判断数组中是否包含指定的元素
function isExist(value, array) {
	var flag = false;
	for (var i = 0; i < array.length; i++) {
		if (array[i] == value) {
			flag = true;
			break;
		}
	}
	return flag;
}