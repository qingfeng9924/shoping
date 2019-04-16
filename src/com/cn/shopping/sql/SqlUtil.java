package com.cn.shopping.sql;

import com.cn.shopping.model.GoodsFirstClass;
import com.cn.shopping.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyuan on 2019/4/10 0010.
 */
public class SqlUtil {

    private static String url = "jdbc:mysql://192.168.93.132:3306/shopping";

    private static String driverName = "com.mysql.jdbc.Driver";

    private static String userName = "root";

    private static String password = "123456";

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


    /**
     * 查询上坪的1级分类
     *
     * @return
     */
    public List<GoodsFirstClass> findGoodsFirstClass(){
        String sql = "SELECT id,name,icon FROM first_class";
        List<GoodsFirstClass> queryResult = new ArrayList<>();
        try {
            this.preparedStatement = connection.prepareStatement(sql);
            resultSet = this.preparedStatement.executeQuery();
            while(resultSet.next()){
                GoodsFirstClass goodsFirstClass = new GoodsFirstClass();
                //取出第一行的第一列
                goodsFirstClass.setId(resultSet.getInt(1));
                goodsFirstClass.setName(resultSet.getString(2));
                goodsFirstClass.setIcon(resultSet.getString(3));
                //将一级分类添加到list
                queryResult.add(goodsFirstClass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return queryResult;
    }
    /**
     * 新增一个用户
     *
     * @param user
     */
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
