package com.wang;

import com.wang.service.UserService;
import com.wang.service.UserServiceImpl;
import org.junit.Test;

/**
 * @ClassName MyTest
 * Description
 * @Author jqWang
 * Date 2021/11/18 22:00
 **/
public class MyTest {
    @Test
    public void test(){
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
