package com.entor.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.runtime.directive.Foreach;
import org.apache.velocity.runtime.directive.contrib.For;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.Result;
import com.entor.entity.Warehousing;
import com.entor.service.IWarehousingService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/warehousing")
public class WarehousingController {

	@Autowired
	private IWarehousingService warehousingService;


	@RequestMapping("/addMore")
	public Result addMore(String goodsIds, String warehouseId) {
		List<Warehousing> list = new ArrayList<>();
		String[] idss = goodsIds.split(",");
		for (String id : idss) {
			Warehousing warehousing = new Warehousing();
			warehousing.setGoodsId(id);
			warehousing.setWarehouseId(warehouseId);
			list.add(warehousing);
		}
		Integer count = list.size();
		warehousingService.saveBatch(list, 300);
		return new Result(0, "入库安排成功！");
	}
}
