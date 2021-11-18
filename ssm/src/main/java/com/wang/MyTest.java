package com.wang;

import com.wang.dao.StudentMapper;
import com.wang.dao.UserMapper;
import com.wang.pojo.Student;
import com.wang.pojo.User;
import com.wang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

/**
 * @ClassName Test
 * Description
 * @Author jqWang
 * Date 2021/11/17 21:19
 **/
public class MyTest {

    static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSession();
        //方法一:
        //List<User> users = session.selectList("com.kuang.mapper.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user: users){
            System.out.println(user);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username","狂神");
        map.put("pwd","123456");
        User user = mapper.selectUserByNP2(map);
        System.out.println(user);
        session.close();

    }
    @Test
    public void addUser(){

        SqlSession session = MybatisUtils.getSession();
        User user = new User(9, "wangjinquan", "123456");
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.addUser(user);
        System.out.println(i);
        session.commit();
        session.close();
    }
    @Test
    public void testGetStudents(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudents();

        for (Student student : students){
            System.out.println(
                    "学生名:"+ student.getName()
                            +"\t老师:"+student.getTeacher().getName());
        }
    }


}
