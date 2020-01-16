package com.entor.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class MyUtil {

	/**
	 * 获取分页结果Map
	 * 
	 * @param page
	 *            页码
	 * @param limit
	 *            页记录数
	 * @param queryWrapper
	 *            条件
	 * @param serviceImpl
	 *            service实现对象
	 * @return
	 */
	public static <T> Map<String, Object> getPage(Integer page, Integer limit, QueryWrapper<T> queryWrapper,
			ServiceImpl<? extends BaseMapper<T>, T> serviceImpl) {
		PageHelper.startPage(page, limit);
		List<T> list = serviceImpl.list(queryWrapper);
		PageInfo<T> info = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}

	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
