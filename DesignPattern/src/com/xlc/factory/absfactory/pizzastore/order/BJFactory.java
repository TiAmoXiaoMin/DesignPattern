package com.xlc.factory.absfactory.pizzastore.order;

import com.xlc.factory.absfactory.pizzastore.pizza.BJCheessPizza;
import com.xlc.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.xlc.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String type) {
        System.out.println("使用北京抽象工厂模式");
        Pizza pizza = null;
        if(type.equals("cheess")){
            pizza = new BJCheessPizza();
            pizza.setName("北京奶酪披萨");
        }else if(type.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }
}
