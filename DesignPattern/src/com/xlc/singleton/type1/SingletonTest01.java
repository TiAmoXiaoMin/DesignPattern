package com.xlc.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton);
        System.out.println("singleton hashcode is" + singleton);
        System.out.println("singleton hashcode2 is" + singleton2);
    }
}
class Singleton{
    private Singleton(){}

    private static final Singleton sin = new Singleton();

    public static Singleton getSingleton(){
        return sin;
    }
}