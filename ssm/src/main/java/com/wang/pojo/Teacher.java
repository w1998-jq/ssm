package com.wang.pojo;

import lombok.Data;

/**
 * @ClassName Teacher
 * Description
 * @Author jqWang
 * Date 2021/11/18 18:50
 **/

public class Teacher {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
