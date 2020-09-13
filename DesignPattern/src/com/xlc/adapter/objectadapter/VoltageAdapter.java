package com.xlc.adapter.objectadapter;

//适配器
public class VoltageAdapter implements Voltage5V{

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        if(null != voltage220V){
            int output220V = voltage220V.output220V();
            int output5V = output220V /44;
            return output5V;
        }else {
            return 0;
        }



    }
}
