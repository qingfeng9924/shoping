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
    private String age;
    //性别？
    private String gender;
    //邮箱？
    private String email;
    //电话
    private String phone;



    public String getName(){ return name; }

    public void setName(String name){ this.name=name; }

    public String getAge(){ return age; }

    public void setAge(String age){ this.age=age; }

    public String getGender(){ return gender; }

    public void setGender(String gender){ this.gender=gender; }

    public String getEmail(){ return email; }

    public void setEmail(String email){ this.email=email; }

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
