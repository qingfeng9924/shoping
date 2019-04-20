package com.cn.shopping.html;

import com.cn.shopping.model.GoodsBusinessClass;
import com.cn.shopping.model.GoodsFirstClass;
import com.cn.shopping.model.GoodsSecondClass;
import com.cn.shopping.model.GoodsThirdClass;
import com.cn.shopping.sql.SqlUtil;
import javafx.application.Application;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.AppletContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyuan on 2019/4/1 0001.
 */
@WebServlet(name = "ToHomeServlet")
public class ToHomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //1.实现1级分类初始化
        SqlUtil sqlUtil = new SqlUtil();
        List<GoodsFirstClass> goodsFirstClassList = sqlUtil.findGoodsFirstClass();

        //查询出所有的二级菜单
        List<GoodsSecondClass> goodsSecondClassList = sqlUtil.findGoodsSecondClass();

        for(GoodsFirstClass goodsFirstClass : goodsFirstClassList){
            List<GoodsSecondClass> goodsSecondClasses = new ArrayList<>();
            for (GoodsSecondClass goodsSecondClass : goodsSecondClassList){
                if(goodsFirstClass.getId().equals(goodsSecondClass.getFirstClassId())){
                    goodsSecondClasses.add(goodsSecondClass);
                }
            }
            goodsFirstClass.setGoodsSecondClassList(goodsSecondClasses);
        }

        //查询出所有的三级菜单
        List<GoodsThirdClass> goodsThirdClassList = sqlUtil.findGoodsThirdClass();
        for(GoodsSecondClass goodsSecondClass : goodsSecondClassList){
            List<GoodsThirdClass> goodsThirdClasses = new ArrayList<>();
            for(GoodsThirdClass goodsThirdClass : goodsThirdClassList){
                if(goodsSecondClass.getId().equals(goodsThirdClass.getSecondClassId())){
                    goodsThirdClasses.add(goodsThirdClass);
                }
            }
            goodsSecondClass.setGoodsThirdClassList(goodsThirdClasses);
        }



        //放入servletContext
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("firstClass",goodsFirstClassList);
        response.sendRedirect("/jsp/index.jsp");
    }
}
