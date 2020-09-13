package com.xlc.proxy.dynamic;



//被代理对象
public class TeacherDao implements ITeacherDao{


    @Override
    public void tea() {
        System.out.println("老师开始讲课了");
    }

    @Override
    public void rest(String name) {
        System.out.println(name +"老师今天休息");
    }
}
