package com.entor.service;

import com.entor.entity.Emp;
import com.entor.entity.Goods;
import com.entor.entity.Result;
import com.entor.entity.Waybill;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
public interface IEmpService extends IMyService<Emp> {
	public Result placingOrder(Waybill waybill, Goods goods);

}
