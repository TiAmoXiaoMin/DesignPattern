package com.xlc.strategy.improve;

//飞行一般
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子飞行能力一般");
    }
}
