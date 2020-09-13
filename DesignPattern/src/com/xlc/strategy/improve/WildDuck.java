package com.xlc.strategy.improve;

//野鸭
public class WildDuck extends Duck {

    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }

}
