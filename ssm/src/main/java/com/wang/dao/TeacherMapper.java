package com.wang.dao;

import com.wang.pojo.oneToMutil.Teacher;

/**
 * @ClassName TeacherMapper
 * Description
 * @Author jqWang
 * Date 2021/11/18 18:52
 **/
public interface TeacherMapper {
    //获取指定老师，及老师下的所有学生
    public Teacher getTeacher(int id);
    public Teacher getTeacher2(int id);
}
