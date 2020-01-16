package com.entor.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.Result;
import com.entor.entity.Warehouse;
import com.entor.service.IWarehouseService;

/**
 * <p>
 * 前端控制器
 * </p>
 * 仓库信息表
 * 
 * @author Willis
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

	@Autowired
	private IWarehouseService warehouseService;

	// 分页加按订单号模糊查询和按发货人查询并分页
	@RequestMapping("/queryByPage")
	public Map<String, Object> queryByPage(int page, int limit) {
		return warehouseService.queryByPage(page, limit);
	}

	// 逐条添加
	@RequestMapping("/add")
	public Result add(Warehouse warehouse) {
		warehouseService.save(warehouse);
		return new Result(0, "数据添加成功!");
	}

	// 批量导入
	@RequestMapping("/addMore")
	public Result addMore(List<Warehouse> list) {
		warehouseService.saveBatch(list, 300);
		return new Result(0, "数据添加成功!");
	}

	// 更新数据
	@RequestMapping("/update")
	public Result update(Warehouse warehouse) {
		warehouseService.updateById(warehouse);
		return new Result(0, "数据更新成功!");
	}

	// 删除功能
	@RequestMapping("/deleteMore")
	public Result deleteMore(String ids) {
		warehouseService.removeByIds(Arrays.asList(ids.split(",")));
		return new Result(0, "数据删除成功!");
	}

	/**
	 * 初始化绑定日期格式
	 *
	 * @param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		// 如果当客户端传递"yyyy-MM-dd"格式的字符串,当成java.util.Date类型处理
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}
