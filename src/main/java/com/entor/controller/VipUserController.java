package com.entor.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.Result;
import com.entor.entity.VipUser;
import com.entor.service.IVipUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/vip-user")
public class VipUserController {

	@Autowired
	private IVipUserService vipUserService;

	@RequestMapping("/queryByPage")
	public Map<String, Object> queryByPage(Integer page, Integer limit, String username, String name) {
		return vipUserService.queryByPage(page, limit, username, name);
	}

	@RequestMapping("/add")
	public Result add(VipUser vipUser) {
		vipUserService.save(vipUser);
		return new Result(0, "数据添加成功!");
	}

	@RequestMapping("/update")
	public Result update(VipUser vipUser) {
		vipUserService.updateById(vipUser);
		return new Result(0, "数据更新成功!");
	}

	@RequestMapping("/deleteMore")
	public Result deleteMore(String ids) {
		vipUserService.removeByIds(Arrays.asList(ids.split(",")));
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
