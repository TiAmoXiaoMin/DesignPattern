package com.xlc.proxy.cglib;


//被代理对象
public class TeacherDao {

    public String tea(){
        System.out.println("老师开始讲课了");
        return "xlc";
    }

}
