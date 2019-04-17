package com.cn.shopping.sql;

import com.cn.shopping.model.GoodsFirstClass;
import com.cn.shopping.model.GoodsSecondClass;
import com.cn.shopping.model.GoodsThirdClass;
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
    public String loginMethod(User user){
        String sql = "select password from user where account = ? or email = ?";
         String pass = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getAccount());
            preparedStatement.setString(2,user.getEmail());

            //????
            resultSet = preparedStatement.executeQuery();
            // 要把光标向下一行才是获取数据
            resultSet.next();
            pass = resultSet.getString("password");

            preparedStatement.close();
            connection.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
        return pass;
    }

    public void insertUser(User user){
        String sql = "insert into user(name,age,gender,account,password,phone,email) values(?,?,?,?,?,?,?)";
        try {
            this.preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getAge());
            preparedStatement.setString(3,user.getGender());
            preparedStatement.setString(4,user.getAccount());
            preparedStatement.setString(5,user.getPassword());
            preparedStatement.setString(6,user.getPhone());
            preparedStatement.setString(7,user.getEmail());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {

        }
    }


    /**
     * 查询出所有的二级菜单
     */
    public List<GoodsSecondClass> findGoodsSecondClass() {
        String sql = "SELECT id,name,first_class_id FROM second_class";
        List<GoodsSecondClass> queryResult = new ArrayList<>();
        try {
            this.preparedStatement = connection.prepareStatement(sql);
            resultSet = this.preparedStatement.executeQuery();
            while(resultSet.next()){
                GoodsSecondClass goodsSecondClass = new GoodsSecondClass();
                //取出第一行的第一列
                goodsSecondClass.setId(resultSet.getInt(1));
                goodsSecondClass.setName(resultSet.getString(2));
                goodsSecondClass.setFirstClassId(resultSet.getInt(3));
                //将一级分类添加到list
                queryResult.add(goodsSecondClass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return queryResult;
    }

    /**
     * 查询出所有的三级菜单
     * @return
     */
    public List<GoodsThirdClass> findGoodsThirdClass() {
        String sql = "SELECT id,name,second_class_id FROM third_class";
        List<GoodsThirdClass> queryResult = new ArrayList<>();
        try {
            this.preparedStatement = connection.prepareStatement(sql);
            resultSet = this.preparedStatement.executeQuery();
            while(resultSet.next()){
                GoodsThirdClass goodsThirdClass = new GoodsThirdClass();
                //取出第一行的第一列
                goodsThirdClass.setId(resultSet.getInt(1));
                goodsThirdClass.setName(resultSet.getString(2));
                goodsThirdClass.setSecondClassId(resultSet.getInt(3));
                //将一级分类添加到list
                queryResult.add(goodsThirdClass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return queryResult;
    }
}
