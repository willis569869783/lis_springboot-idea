package com.entor.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Truck;
import com.entor.mapper.TruckMapper;
import com.entor.service.ITruckService;
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
public class TruckServiceImpl extends ServiceImpl<TruckMapper, Truck> implements ITruckService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		QueryWrapper<Truck> queryWrapper = new QueryWrapper<>();
		if (objects[0] != null && !objects[0].equals("")) {
			queryWrapper.like("Truck_number", objects[0]);
		}
		return MyUtil.getPage(page, limit, queryWrapper, this);
	}

}
