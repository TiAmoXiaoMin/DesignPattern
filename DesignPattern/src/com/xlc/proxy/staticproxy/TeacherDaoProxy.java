package com.xlc.proxy.staticproxy;

//代理对象 必须实现和被代理对象一样的接口
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao target){
        this.iTeacherDao = target;
    }


    @Override
    public void teach() {
        System.out.println("开始代理....");
        iTeacherDao.teach();
        System.out.println("提交...");
    }
}
