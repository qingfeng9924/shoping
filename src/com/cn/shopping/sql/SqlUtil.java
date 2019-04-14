package com.cn.shopping.sql;

import com.cn.shopping.model.User;

import java.sql.*;

/**
 * Created by zhangyuan on 2019/4/10 0010.
 */
public class SqlUtil {

    private static String url = "jdbc:mysql://localhost/shopping";

    private static String driverName = "com.mysql.jdbc.Driver";

    private static String userName = "root";

    private static String password = "zerosama2333";

    private PreparedStatement preparedStatement;

    private ResultSet resultSet;

    private Connection connection;

    public SqlUtil(){
        try {
            //1.加载驱动
            Class.forName(driverName);
            //2.连接mysql
            this.connection = DriverManager.getConnection(url,userName,password);
            //3.获取preparedStatement对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertUser(User user){
        String sql = "insert into user(name,age,gender,account,password,phone,email) values(?,?,?,?,?,?,?)";
        try {
            this.preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(1,user.getAge());
            preparedStatement.setString(1,user.getGender());
            preparedStatement.setString(1,user.getAccount());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getPhone());
            preparedStatement.setString(1,user.getEmail());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {

        }
    }
    public void searchUser(){

        String account="select account,password from user ";
    }

}
