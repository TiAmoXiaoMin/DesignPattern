package com.xlc.adapter.classadapter;

public class Phone {

    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("正在使用5v充电器充电");
        }else{
            System.out.println("不是5v充电器,充电失败");
        }

    }

}
