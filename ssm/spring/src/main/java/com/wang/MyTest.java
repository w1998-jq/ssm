package com.wang;

import com.wang.pojo.Hello;
import com.wang.pojo.Student;
import com.wang.pojo.User;
import com.wang.service.UserService;
import com.wang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * Description
 * @Author jqWang
 * Date 2021/11/18 22:00
 **/
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        student.show();
    }
}
