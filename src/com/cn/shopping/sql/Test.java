package com.cn.shopping.sql;

import com.cn.shopping.model.GoodsFirstClass;

import java.util.List;

/**
 * Created by zhangyuan on 2019/4/16 0016.
 */
public class Test {
    public static void main(String []args){
        SqlUtil sqlUtil = new SqlUtil();
        List<GoodsFirstClass> list = sqlUtil.findGoodsFirstClass();
        System.out.print(list);
    }
}
