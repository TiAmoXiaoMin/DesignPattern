package com.xlc.facate;

public class Stereo {

    private static Stereo instance = new Stereo();

    public static  Stereo getInstance(){
        return instance;
    }


    public void up(){
        System.out.println("Stereo 立体声打开了");
    }

    public void down(){
        System.out.println("Stereo 立体声调大了");
    }


    public void off(){
        System.out.println("Screen 立体声关上了");
    }

}
