package com.xlc.proxy.staticproxy;

//被代理对象
public class TeacherDao implements ITeacherDao{


    @Override
    public void teach() {
        System.out.println("老师开始上课了");
    }
}
