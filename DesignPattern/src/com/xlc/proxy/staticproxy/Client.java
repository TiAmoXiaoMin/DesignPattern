package com.xlc.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teaProxy = new TeacherDaoProxy(new TeacherDao());
        teaProxy.teach();
    }
}
