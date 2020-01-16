package com.entor.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Warehouse;
import com.entor.mapper.WarehouseMapper;
import com.entor.service.IWarehouseService;
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
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements IWarehouseService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		QueryWrapper<Warehouse> queryWrapper = new QueryWrapper<>();

		return MyUtil.getPage(page, limit, queryWrapper, this);
	}

}
