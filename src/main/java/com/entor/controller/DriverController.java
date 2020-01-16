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

import com.entor.entity.Driver;
import com.entor.entity.Result;
import com.entor.service.IDriverService;

/**
 * <p>
 * 前端控制器
 * </p>
 * 司机信息操作
 * 
 * @author Willis
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	private IDriverService driverService;

	// 分页查询
	@RequestMapping("/queryBypage")
	public Map<String, Object> queryBypage(int page, int limit) {
		return driverService.queryByPage(page, limit);
	}

	@RequestMapping("/add")
	public Result add(Driver driver) {
		driverService.save(driver);
		return new Result(0, "司机添加成功！");
	}

	@RequestMapping("/addMore")
	public Result addMore(List<Driver> driver) {
		driverService.saveBatch(driver, 300);
		return new Result(0, "司机添加成功！");
	}

	// 更新数据
	@RequestMapping("/update")
	public Result update(Driver driver) {
		driverService.updateById(driver);
		return new Result(0, "司机更新成功!");
	}

	// 删除功能
	@RequestMapping("/deleteMore")
	public Result deleteMore(String ids) {
		driverService.removeByIds(Arrays.asList(ids.split(",")));
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
