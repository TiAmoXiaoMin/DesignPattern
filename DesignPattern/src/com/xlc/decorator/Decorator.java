package com.xlc.decorator;

//装饰者类
public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice() 自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes() 输出装饰者的信息
        return super.getDes() +" " + super.getPrice() + " &&"+ obj.getDes() ;
    }
}
