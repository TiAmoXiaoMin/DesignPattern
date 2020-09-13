package com.xlc.facate;

public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static  Popcorn getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("Popcorn爆米花机打开了");

    }

    public void pop(){
        System.out.println("Popcorn爆米花机爆好了");
    }

    public void off(){
        System.out.println("Popcorn爆米花机关上了");
    }

}
