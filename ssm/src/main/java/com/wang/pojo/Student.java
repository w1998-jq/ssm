package com.wang.pojo;

import lombok.Data;

/**
 * @ClassName Student
 * Description
 * @Author jqWang
 * Date 2021/11/18 18:51
 **/

public class Student {
    private int id;
    private String name;
    private Teacher teacher;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
