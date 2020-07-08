package com.mybatis.test.controller;

import com.rrg.myshop.entity.ShoppingCart;
import com.rrg.myshop.service.ShoppingCartService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopCartController {

    @Reference
    private ShoppingCartService shoppingCartService;

    @RequestMapping("/shopcartList")
    public List<ShoppingCart> getByUsrId(){
        return shoppingCartService.findAllByUserId(1);
    }
}
