package com.xlc.facate;

public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVDPlayer DVD打开了");
    }

    public void play(){
        System.out.println("DVDPlayer DVD播放了");
    }

    public void pause(){
        System.out.println("DVDPlayer DVD暂停了");
    }

    public void off(){
        System.out.println("DVDPlayer DVD关闭了");
    }
}
