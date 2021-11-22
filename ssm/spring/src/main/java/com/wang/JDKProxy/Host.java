package com.wang.JDKProxy;

/**
 * @ClassName Host
 * Description
 * @Author jqWang
 * Date 2021/11/22 10:35
 **/
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
