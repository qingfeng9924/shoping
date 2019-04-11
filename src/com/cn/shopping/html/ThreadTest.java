package com.cn.shopping.html;

/**
 * Created by zhangyuan on 2019/4/11 0011.
 */
//1.继承Thread类
public class ThreadTest{
    public static void main(String []args){


        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();


        Thread thread = new Thread(new ThreadDemo2());
        thread.start();
    }
}

//1.继承Thread类
class ThreadDemo extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.print("hello1");
    }
}

//2.自己是实现Runnable接口
class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        System.out.print("hello2");
    }
}