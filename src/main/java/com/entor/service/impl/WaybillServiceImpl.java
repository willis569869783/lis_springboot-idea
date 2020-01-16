package com.entor.service.impl;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.entor.util.MyUtil;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Waybill;
import com.entor.mapper.WaybillMapper;
import com.entor.service.IWaybillService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Willis
 * @since 2020-01-15
 */
@Service
public class WaybillServiceImpl extends ServiceImpl<WaybillMapper, Waybill> implements IWaybillService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		QueryWrapper<Waybill> queryWrapper = new QueryWrapper<>();
		if(objects[0]!=null&&objects[0].equals("")){
			queryWrapper.like("username",objects[0]);
		}
		if(objects[1]!=null&&objects[1].equals("")){
			queryWrapper.like("name",objects[1]);
		}
		return MyUtil.getPage(page,limit,queryWrapper,this);
	}

}
