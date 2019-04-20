package com.cn.shopping.goods;

import com.cn.shopping.model.Goods;
import com.cn.shopping.sql.SqlUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhangyuan on 2019/4/20 0020.
 */
@WebServlet(name = "ToGoodsDetailServlet")
public class ToGoodsDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        SqlUtil sqlUtil = new SqlUtil();
        Goods goods = sqlUtil.findGoodsById(id);
        //
    }
}
