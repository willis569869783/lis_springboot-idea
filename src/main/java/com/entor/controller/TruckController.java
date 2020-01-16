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
import com.entor.entity.Truck;
import com.entor.service.ITruckService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Willis
 * @since 2020-01-07 车辆管理
 */
@RestController
@RequestMapping("/truck")
public class TruckController {

	@Autowired
	private ITruckService truckService;

	// 分页查询和分页根据车牌号模糊查询
	@RequestMapping("/queryBypage")
	public Map<String, Object> queryBypage(int page, int limit, String truckNumber) {
		return truckService.queryByPage(page, limit, truckNumber);
	}

	@RequestMapping("/add")
	public Result add(Truck truck) {
		truckService.save(truck);
		return new Result(0, "车辆添加成功！");
	}

	@RequestMapping("/addMore")
	public Result addMore(List<Truck> truck) {
		truckService.saveBatch(truck, 300);
		return new Result(0, "车辆添加成功！");
	}

	// 更新数据
	@RequestMapping("/update")
	public Result update(Truck truck) {
		truckService.updateById(truck);
		return new Result(0, "数据更新成功!");
	}

	// 删除功能
	@RequestMapping("/deleteMore")
	public Result deleteMore(String ids) {
		truckService.removeByIds(Arrays.asList(ids.split(",")));
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
