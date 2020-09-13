package com.xlc.strategy.improve;

//玩具鸭
public class ToyDuck extends Duck {

    public ToyDuck(){
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }


    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~~");
    }

}
