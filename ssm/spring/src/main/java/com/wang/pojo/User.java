package com.wang.pojo;

/**
 * @ClassName User
 * Description
 * @Author jqWang
 * Date 2021/11/19 14:46
 **/
public class User {
    private String name;
    public User(){
        System.out.println("无参构造");
    }

    public User(String name){
        System.out.println(123);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name = " + name);
    }
}
