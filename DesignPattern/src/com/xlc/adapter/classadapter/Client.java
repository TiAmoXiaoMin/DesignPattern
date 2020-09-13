package com.xlc.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("==========类适配器模式===========");
        new Phone().charging(new VoltageAdapter());


    }

}
