package com.entor.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Goods;
import com.entor.mapper.GoodsMapper;
import com.entor.service.IGoodsService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Willis
 * @since 2020-01-15
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
