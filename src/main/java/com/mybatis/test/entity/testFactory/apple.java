package com.mybatis.test.entity.testFactory;

public class apple implements fruit{
    private String name="apple";
    private int price;

    @Override
    public String toString() {
        return "apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
