package com.xlc.template.improve;

public class Client {

    public static void main(String[] args) {
        System.out.println("====使用红豆制作豆浆====");

        SoyaMilk redbean = new RedBeanSoyaMilk();
        redbean.make();

        System.out.println("====使用花生制作豆浆====");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("====制作原味豆浆====");
        SoyaMilk pure = new PureSoyaMilk();
        pure.make();












    }
}
