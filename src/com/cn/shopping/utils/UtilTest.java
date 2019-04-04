package com.cn.shopping.utils;

import com.cn.shopping.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangyuan on 2019/4/1 0001.
 */
public class UtilTest {
    public static void main(String []args){
        //Map,List,Set -> Collection
        //只看map ->HashMap,HashTable,ConcurrentHashMap
        Map<Integer,String> map = new HashMap();
        //(101,"tom"),(102,"kangkang")
        map.put(101,"tom");
        map.put(102,"kangkang");
        System.out.print(map);
        System.out.print("学号为101的学生是："+ map.get(101));
        //1,整理List -> ArrayList,LinkedList,Vector

        //2,整理set -> HashSet,LinkedHashSet
    }

    //
    public static Map<String,User> map = new HashMap();

    static {
        //key,Object
        User user1 = new User();
        user1.setAccount("hexi");
        user1.setPassword("hexi");
        map.put(user1.getAccount(),user1);
        User user2 = new User();
        user2.setAccount("yan");
        user2.setPassword("");
        map.put(user2.getAccount(),user2);
    }
}
