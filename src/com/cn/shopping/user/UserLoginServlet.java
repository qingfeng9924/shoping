package com.cn.shopping.user;

import com.cn.shopping.model.User;
import com.cn.shopping.sql.SqlUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by zhangyuan on 2019/4/1 0001.
 */
@WebServlet(name = "UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String account = request.getParameter("account");
        System.out.print(account);
        String email = request.getParameter("email");
        System.out.print(email);
        String password = request.getParameter("password");

        User newUser = new User();
        newUser.setAccount(account);
        newUser.setPassword(password);
        newUser.setEmail(email);
        SqlUtil sqlUtil=new SqlUtil();
        String userPwd = sqlUtil.loginMethod(newUser);



        request.getRequestDispatcher("/toHome").forward(request,response);
    }

    //（键：值）
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {






    }






}
