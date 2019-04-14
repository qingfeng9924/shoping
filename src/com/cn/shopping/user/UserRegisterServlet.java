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
 * Created by zhangyuan on 2019/4/10 0010.
 */
@WebServlet(name = "UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String account = request.getParameter("account");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String passwordRepeat = request.getParameter("passwordRepeat");
        if(password.equals(passwordRepeat)){
            User newUser = new User();
            newUser.setName(name);
            newUser.setAge(age);
            newUser.setGender(gender);
            newUser.setAccount(account);
            newUser.setPassword(password);
            newUser.setPhone(phone);
            newUser.setEmail(email);
            //存入数据库
            SqlUtil sqlUtil = new SqlUtil();
            sqlUtil.insertUser(newUser);
            request.getRequestDispatcher("/toLogin").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
