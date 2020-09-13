package com.xlc.decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力 Chocolate");
        setPrice(1.5f);
    }
}
