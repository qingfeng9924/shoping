package com.cn.shopping.html;

import java.io.IOException;

/**
 * Created by zhangyuan on 2019/3/30 0030.
 */
public class ToLoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.sendRedirect("/jsp/Login.jsp");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.sendRedirect("/jsp/Login.jsp");
    }
}
