package com.cn.shopping.model;

public class Goods {
    private Integer id;
    private String name;
    private float pricePre;
    private float priceNow;
    private String describ;
    private Integer thirdClassId;
    private Integer num;
    private Integer SalesVolume;
    private String icon;

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setSalesVolume(Integer salesVolume) {
        SalesVolume = salesVolume;
    }

    public Integer getSalesVolume() {
        return SalesVolume;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPricePre() {
        return pricePre;
    }

    public float getPriceNow() {
        return priceNow;
    }

    public String getDescrib() {
        return describ;
    }

    public Integer getThirdClassId() {
        return thirdClassId;
    }

    public Integer getNum() {
        return num;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePre(float pricePre) {
        this.pricePre = pricePre;
    }

    public void setPriceNow(float priceNow) {
        this.priceNow = priceNow;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public void setThirdClassId(Integer thirdClassId) {
        this.thirdClassId = thirdClassId;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
