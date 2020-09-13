package com.xlc.factory.absfactory.pizzastore.pizza;

public abstract class Pizza {

    protected String name;

    public void setName(String name){
        this.name = name;
    }

    public void prepare(){
        System.out.println("正在准备制作"+name+"pizza");
    }
    public abstract void bake();

    public abstract void cut();

    public abstract void box();

}
