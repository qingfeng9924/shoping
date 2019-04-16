package com.cn.shopping.html;

import com.cn.shopping.model.GoodsFirstClass;
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
        //放入servletContext
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("firstClass",goodsFirstClassList);
        response.sendRedirect("/jsp/index.jsp");
    }
}
