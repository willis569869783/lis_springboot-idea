package com.entor.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Emp;
import com.entor.entity.Goods;
import com.entor.entity.Result;
import com.entor.entity.Waybill;
import com.entor.mapper.EmpMapper;
import com.entor.service.IEmpService;
import com.entor.service.IGoodsService;
import com.entor.service.IWaybillService;
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
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

	@Autowired
	private IWaybillService waybillService;
	@Autowired
	private IGoodsService goodsService;

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
		return MyUtil.getPage(page, limit, queryWrapper, this);
	}

	@Override
	@Transactional
	public Result placingOrder(Waybill waybill, Goods goods) {
		String uid = MyUtil.getUUID();
		waybill.setWaybillNo(uid);
		waybill.setWayvillState(1);
		goods.setWaybillId(uid);
		waybillService.save(waybill);
		goodsService.save(goods);
		return new Result(0, "下单成功！");
	}

}
