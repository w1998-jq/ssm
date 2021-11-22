package com.wang.JDKProxy;

/**
 * @ClassName Client
 * Description
 * @Author jqWang
 * Date 2021/11/22 10:42
 **/
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        Rent proxy =  (Rent) pih.getProxy();
        proxy.rent();
    }
}
