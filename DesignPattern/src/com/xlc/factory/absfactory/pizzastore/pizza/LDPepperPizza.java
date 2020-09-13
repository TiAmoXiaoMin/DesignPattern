package com.xlc.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza{

    @Override
    public void bake() {
        System.out.println("正在烤披萨");
    }

    @Override
    public void cut() {
        System.out.println("正在切披萨");
    }

    @Override
    public void box() {
        System.out.println("正在打包披萨");
    }
}
