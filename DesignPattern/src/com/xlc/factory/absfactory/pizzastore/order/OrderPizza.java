package com.xlc.factory.absfactory.pizzastore.order;

import com.xlc.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }


    AbsFactory absFactory;

    private void setFactory(AbsFactory absFactory){
        String orderType="";
        Pizza pizza = null;
        this.absFactory = absFactory;
        do{

            orderType = getType();

            pizza = absFactory.createPizza(orderType);

            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.box();
                pizza.cut();
            }else {
                System.out.println("制作失败");
                break;
            }



        }while (true);
    }

    public String getType(){

            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入披萨的种类: ");
            String str = null;
        try {
            str = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;


    }





}
