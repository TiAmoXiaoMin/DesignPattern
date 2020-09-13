package com.xlc.proxy.cglib;

public class Client {

    public static void main(String[] args) {
        TeacherDao tea = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(tea);
        TeacherDao instance =(TeacherDao) proxyFactory.getProxyInstance();
        String name = instance.tea();
        System.out.println(name);
    }
}
