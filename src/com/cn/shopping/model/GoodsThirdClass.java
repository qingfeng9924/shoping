package com.cn.shopping.model;

/**
 * Created by zhangyuan on 2019/4/18 0018.
 */
public class GoodsThirdClass {
    private Integer id;

    private String name;

    private Integer secondClassId;
    private Integer businessClassId;

    public Integer getId() {
        return id;
    }

    public void setBusinessClassId(Integer businessClassId) {
        this.businessClassId = businessClassId;
    }

    public Integer getBusinessClassId() {
        return businessClassId;
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

    public Integer getSecondClassId() {
        return secondClassId;
    }

    public void setSecondClassId(Integer secondClassId) {
        this.secondClassId = secondClassId;
    }
}
