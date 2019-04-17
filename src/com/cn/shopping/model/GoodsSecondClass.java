package com.cn.shopping.model;

import java.util.List;

/**
 * Created by zhangyuan on 2019/4/17 0017.
 */
public class GoodsSecondClass {

    private Integer id;

    private String name;

    private Integer firstClassId;

    List<GoodsThirdClass> goodsThirdClassList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstClassId() {
        return firstClassId;
    }

    public void setFirstClassId(Integer firstClassId) {
        this.firstClassId = firstClassId;
    }

    public List<GoodsThirdClass> getGoodsThirdClassList() {
        return goodsThirdClassList;
    }

    public void setGoodsThirdClassList(List<GoodsThirdClass> goodsThirdClassList) {
        this.goodsThirdClassList = goodsThirdClassList;
    }
}
