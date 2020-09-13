package com.xlc.bridge;

public class Client {

    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Vivo());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();


        System.out.println("===================================");

        FoldedPhone foldedPhone2 = new FoldedPhone(new XiaoMi());
        foldedPhone2.open();
        foldedPhone2.call();
        foldedPhone2.close();

        System.out.println("===================================");
        UpRightPhone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

        System.out.println("===================================");
        UpRightPhone upRightPhone2 = new UpRightPhone(new Vivo());
        upRightPhone2.open();
        upRightPhone2.call();
        upRightPhone2.close();

    }
}
