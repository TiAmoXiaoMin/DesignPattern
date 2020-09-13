package com.xlc.decorator;

//coffee类
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
