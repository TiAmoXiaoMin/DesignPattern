package com.xlc.proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao target = (ITeacherDao)proxyFactory.getProxyInstance();
      //  target.tea();
        target.rest("zdf");
    }
}
