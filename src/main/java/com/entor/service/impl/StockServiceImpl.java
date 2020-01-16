package com.entor.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Stock;
import com.entor.mapper.StockMapper;
import com.entor.service.IStockService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
