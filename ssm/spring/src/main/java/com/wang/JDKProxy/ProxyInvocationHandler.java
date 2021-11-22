package com.wang.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @ClassName ProxyInvocationHandler
 * Description
 * @Author jqWang
 * Date 2021/11/22 10:36
 **/
public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouses();
        Object res = method.invoke(rent,args);
        fare();
        return res;
    }

    public void seeHouses(){
        System.out.println("带客户看房");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
