package com.xlc.adapter.objectadapter;

//被适配
public class Voltage220V {

    public int output220V(){
        int src = 220;
        System.out.println("电压"+src+"伏");
        return src;
    }

}
