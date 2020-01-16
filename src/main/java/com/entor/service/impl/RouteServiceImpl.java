package com.entor.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Route;
import com.entor.mapper.RouteMapper;
import com.entor.service.IRouteService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Willis
 * @since 2020-01-15
 */
@Service
public class RouteServiceImpl extends ServiceImpl<RouteMapper, Route> implements IRouteService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {

		return null;
	}

}
