package com.xlc.facate;

public class Projector {

    private  static Projector instance = new Projector();

    public static  Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector 投影仪打开了");

    }

    public void focus(){
        System.out.println("Projector 投影仪聚焦中");
    }

    public void off(){
        System.out.println("Projector 投影仪关闭了");
    }



}
