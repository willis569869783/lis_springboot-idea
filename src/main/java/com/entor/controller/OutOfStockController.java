package com.entor.controller;


import com.entor.entity.OutOfStock;
import com.entor.entity.Result;
import com.entor.service.IOutOfStockService;
import com.sun.deploy.util.OrderedHashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/out-of-stock")
public class OutOfStockController {

    @Autowired
    private IOutOfStockService outOfStockService;

    @RequestMapping("/addMore")
    public Result addMore(OutOfStock outOfStock, String goodsIds) {
        List<OutOfStock> list = new ArrayList<>();
        String[] ids = goodsIds.split(",");
        for (String id : ids) {
            outOfStock.setGoodsId(id);
            list.add(outOfStock);
        }
        outOfStockService.saveBatch(lit, 300);
        return null;
    }


}

