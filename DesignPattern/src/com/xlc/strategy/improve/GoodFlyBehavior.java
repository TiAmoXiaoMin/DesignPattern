package com.xlc.strategy.improve;

//会飞
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("鸭子会飞~~~");
    }
}
