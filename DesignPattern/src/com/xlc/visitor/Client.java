package com.xlc.visitor;

public class Client {

    public static void main(String[] args) {
        //创建ObjectStructure对象
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);
    }

}