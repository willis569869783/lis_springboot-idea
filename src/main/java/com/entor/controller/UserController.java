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

import com.entor.entity.Goods;
import com.entor.entity.Result;
import com.entor.entity.User;
import com.entor.entity.Waybill;
import com.entor.service.IUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/queryByPage")
	public Map<String, Object> queryByPage(int page, int limit) {
		return userService.queryByPage(page, limit);
	}

	// 逐条添加
	@RequestMapping("/add")
	public Result add(User user) {
		userService.save(user);
		return new Result(0, "数据添加成功!");
	}

	// 批量导入
	@RequestMapping("/addMore")
	public Result addMore(List<User> list) {
		userService.saveBatch(list, 300);
		return new Result(0, "数据添加成功!");
	}

	// 更新数据
	@RequestMapping("/update")
	public Result update(User user) {
		userService.updateById(user);
		return new Result(0, "数据更新成功!");
	}

	// 删除功能
	@RequestMapping("/deleteMore")
	public Result deleteMore(String ids) {
		userService.removeByIds(Arrays.asList(ids.split(",")));
		return new Result(0, "数据删除成功!");
	}

	// 订单提交
	@RequestMapping("/placingOrder")
	public Result placingOrder(Waybill waybill, Goods goods) {
		return userService.placingOrder(waybill, goods);
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
