package com.cn.shopping.user;

import com.cn.shopping.model.User;
import com.cn.shopping.utils.UtilTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by zhangyuan on 2019/4/1 0001.
 */
@WebServlet(name = "UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //（键：值）
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //帐户名
        String account = request.getParameter("account");
        System.out.print(account);
        //密码
        String password = request.getParameter("password");
        // == equls() 的区别
        if (UtilTest.map.containsKey(account)){
            if(password.equals(UtilTest.map.get(account).getPassword())){
                //保存用户登6状态
                //最原始的方法，保存在session里面,用户会话
                HttpSession session = request.getSession();
                //将登陆用户的用户信息存入session
                session.setAttribute("user",UtilTest.map.get(account));
                request.getRequestDispatcher("/toHome").forward(request,response);
            } else {
                //完善
            }
        } else {
            //完善
        }


//        if(account.equals("qingfeng")){
//            if(password.equals("123456")){
//                request.getRequestDispatcher("/toHome").forward(request,response);
//            }
//        }

    }
}
