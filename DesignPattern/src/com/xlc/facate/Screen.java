package com.xlc.facate;

public class Screen {


    private static Screen instance = new Screen();

    public static  Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen 屏幕向上打开了");
    }

    public void down(){
        System.out.println("Screen 屏幕向下关上了");
    }

}
