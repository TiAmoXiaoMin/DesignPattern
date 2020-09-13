package com.xlc.strategy.improve;

//不会飞
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("鸭子不会飞~~~");
    }
}
