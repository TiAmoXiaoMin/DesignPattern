package com.xlc.strategy;

//鸭子
public abstract class Duck {

    public abstract void display();

    public void quack(){
        System.out.println("鸭子会叫~~~");
    }

    public void swim(){
        System.out.println("鸭子会游泳~~~");
    }

    public void fly(){
        System.out.println("鸭子会飞~~~");
    }

}
