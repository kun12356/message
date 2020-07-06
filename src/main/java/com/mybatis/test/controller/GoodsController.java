package com.mybatis.test.controller;

import com.mybatis.test.entity.Goods;
import com.mybatis.test.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/getById")
    public Goods get(){
        return goodsService.selectByPrimaryKey(1);
    }
}
