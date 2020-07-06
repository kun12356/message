package com.mybatis.test.entity.testFactory;

import java.util.HashMap;

public class Factory {
    public static fruit get(String fruitName) throws Exception {
        return (fruit) Class.forName(fruitName).newInstance();
    }


    public static void main(String[] args) throws Exception {
        //这里的classname要传入全限定类名
        fruit apple = Factory.get("com.mybatis.test.entity.testFactory.apple");
        System.out.println(apple);
        //new HashMap<String,String>();
    }
}
