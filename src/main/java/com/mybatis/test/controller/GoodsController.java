package com.mybatis.test.controller;


import com.rrg.myshop.entity.Goods;
import com.rrg.myshop.service.GoodsService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Reference
    private GoodsService goodsService;

    @RequestMapping("/getById")
    public Goods get(){
        return goodsService.selectByPrimaryKey(1);
    }
}
