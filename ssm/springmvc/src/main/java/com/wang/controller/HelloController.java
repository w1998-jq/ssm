package com.wang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * Description
 * @Author jqWang
 * Date 2021/11/22 15:50
 **/
@Controller
@RequestMapping("/HelloController")
public class HelloController{
    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("msg","hello springMVC");
        return "hello";
    }
}
