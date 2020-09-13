package com.xlc.facate;

public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static  TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight 剧院灯光开了");
    }

    public void dim(){
        System.out.println("TheaterLight 剧院灯光调亮了");
    }


    public void bright(){
        System.out.println("TheaterLight 剧院灯光调暗了");
    }

    public void off(){
        System.out.println("TheaterLight 剧院灯光调关了");
    }
}
