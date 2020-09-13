package com.xlc.singleton.type4;

public class SingletonTest04{
    public static void main(String[] args) {
        System.out.println("懒汉式 线程安全，同步方法");
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton);
        System.out.println("singleton hashcode is" + singleton.hashCode());
        System.out.println("singleton hashcode2 is" + singleton2.hashCode());
        System.out.println("singleton hashcode is" + singleton);
        System.out.println("singleton hashcode2 is" + singleton2);
    }
}

class Singleton{

    private Singleton(){}

    private static Singleton singleton;

    public static synchronized Singleton getSingleton(){
        if(singleton == null){
            return singleton = new Singleton();
        }
        return singleton;
    }

}