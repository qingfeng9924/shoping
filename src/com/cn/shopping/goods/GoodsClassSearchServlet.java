package com.cn.shopping.goods;

import com.cn.shopping.model.Goods;
import com.cn.shopping.sql.SqlUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GoodsClassSearchServlet")
public class GoodsClassSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("thirdClassId");
        SqlUtil sqlUtil = new SqlUtil();
        List<Goods> goodsSearchList = sqlUtil.findGoodsByThirdClassId(Integer.parseInt(id));
        HttpSession session = request.getSession();
        session.setAttribute("searchResult",goodsSearchList);
        response.sendRedirect("/jsp/GoodsSearchResult.jsp");
    }
}
