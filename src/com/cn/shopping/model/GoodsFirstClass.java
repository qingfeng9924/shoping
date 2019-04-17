package com.cn.shopping.model;

import java.util.List;

/**
 * Created by zhangyuan on 2019/4/16 0016.
 */
public class GoodsFirstClass {

    private Integer id;

    private String name;

    private String icon;

    //包含多个二级菜单

    private List<GoodsSecondClass> goodsSecondClassList;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<GoodsSecondClass> getGoodsSecondClassList() {
        return goodsSecondClassList;
    }

    public void setGoodsSecondClassList(List<GoodsSecondClass> goodsSecondClassList) {
        this.goodsSecondClassList = goodsSecondClassList;
    }
}
