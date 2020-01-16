package com.entor.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Driver;
import com.entor.mapper.DriverMapper;
import com.entor.service.IDriverService;
import com.entor.util.MyUtil;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@Service
public class DriverServiceImpl extends ServiceImpl<DriverMapper, Driver> implements IDriverService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		QueryWrapper<Driver> queryWrapper = new QueryWrapper<>();
		return MyUtil.getPage(page, limit, queryWrapper, this);
	}

}
