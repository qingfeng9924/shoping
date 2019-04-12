package com.cn.shopping.model;

/**
 * Created by zhangyuan on 2019/4/1 0001.
 */
public class User {
    //姓名
    private String name;
    //账户
    private String account;
    //密码
    private String password;
    //年龄？

    //性别？

    //邮箱？
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
