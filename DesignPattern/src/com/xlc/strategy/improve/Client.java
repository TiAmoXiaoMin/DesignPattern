package com.xlc.strategy.improve;

public class Client {
    public static void main(String[] args) {


        Duck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.quack();

        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();

        Duck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.quack();
        System.out.println("改变鸭子的状态");
        pekingDuck.setFlyBehavior(new BadFlyBehavior());
        pekingDuck.fly();

    }
}
