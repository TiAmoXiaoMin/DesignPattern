package com.xlc.factory.absfactory.pizzastore.order;

import com.xlc.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {

    public Pizza createPizza(String type);

}
