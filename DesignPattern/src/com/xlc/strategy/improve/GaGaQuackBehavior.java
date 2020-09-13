package com.xlc.strategy.improve;

public class GaGaQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("嘎嘎的叫");
    }
}
