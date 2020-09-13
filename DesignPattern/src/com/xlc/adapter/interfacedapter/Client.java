package com.xlc.adapter.interfacedapter;

public class Client {

    public static void main(String[] args) {
     /*new AbsAdapter(){

            @Override
            public void m1() {
                System.out.println("使用m1的方法");
            }
        }.m1();*/



       AbsAdapter absAdapter =  new AbsAdapter(){

            @Override
            public void m1() {
                System.out.println("使用m1的方法");
            }
        };

        absAdapter.m1();
    }
}
