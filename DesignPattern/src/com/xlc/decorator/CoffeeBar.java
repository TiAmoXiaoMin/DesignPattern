package com.xlc.decorator;

public class CoffeeBar {

    public static void main(String[] args) {

        //装饰着模式下的订单:2份巧克力+ 一份牛奶的Espresso
        //点一份Espresso
        Drink order = new Espresso();
        System.out.println("费用:" +order.cost());
        System.out.println("咖啡描述信息:" + order.getDes());

        //点一份Espresso和一份牛奶
        order = new Milk(order);
        System.out.println( " 加入一杯牛奶的费用:" + order.cost());
        System.out.println("描述信息:"+ order.getDes());

        //点一份Espresso和一份牛奶和一份巧克力
        order = new Chocolate(order);
        System.out.println(" 加入一杯牛奶和一份巧克力的费用:" + order.cost() );
        System.out.println("描述信息:"+ order.getDes());

        //点一份Espresso和一份牛奶和两个巧克力
        order = new Chocolate(order);
        System.out.println(" 加入一杯牛奶和两份巧克力的费用:" + order.cost() );
        System.out.println("描述信息:"+ order.getDes());


        System.out.println("=======================");
        //点一杯无因咖啡 加一份牛奶
        // 因咖啡
        Drink order2 = new DeCaf();
        System.out.println("费用:" +order2.cost());
        System.out.println("咖啡描述信息:" + order2.getDes());

        //无因咖啡加一份牛奶
        order2 =  new Milk(order2);
        System.out.println(" 加入一杯牛奶和两份巧克力的费用:" + order2.cost() );
        System.out.println("描述信息:"+ order2.getDes());










    }
}
