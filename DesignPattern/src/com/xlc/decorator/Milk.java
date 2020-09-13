package com.xlc.decorator;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶 Mile");
        setPrice(1.5f);
    }
}
