package com.mybatis.test.entity;

/**
 * goods
 */
public class Goods {
    /**
     * id
     */
    private Integer id;

    /**
     * price
     */
    private Integer price;

    /**
     * url
     */
    private String url;

    /**
     * goodClassfiy
     */
    private Integer goodClassfiy;

    /**
     * delete
     */
    private Integer delete;

    /**
     * goodDetail
     */
    private String goodDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getGoodClassfiy() {
        return goodClassfiy;
    }

    public void setGoodClassfiy(Integer goodClassfiy) {
        this.goodClassfiy = goodClassfiy;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public String getGoodDetail() {
        return goodDetail;
    }

    public void setGoodDetail(String goodDetail) {
        this.goodDetail = goodDetail;
    }
}