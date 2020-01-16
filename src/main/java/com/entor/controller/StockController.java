package com.entor.controller;


import com.entor.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private IStockService stockService;

    public Map<String,Object> queryByPage(Integer page,Integer limit){
        return stockService.queryByPage(page,limit);
    }
}

