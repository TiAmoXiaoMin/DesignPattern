package com.xlc.adapter.classadapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {

       int a =  output220V() / 44 ;

       return a;
    }
}
