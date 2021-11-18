package com.wang.pojo.oneToMutil;

import java.util.List;

/**
 * @ClassName Teacher
 * Description
 * @Author jqWang
 * Date 2021/11/18 21:22
 **/
public class Teacher {
    private int id;
    private String name;
    //一个老师多个学生
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
