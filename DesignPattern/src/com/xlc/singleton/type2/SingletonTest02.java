package com.xlc.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton);
        System.out.println("singleton hashcode is" + singleton.hashCode());
        System.out.println("singleton hashcode2 is" + singleton2.hashCode());
    }
}

class Singleton{
    private Singleton(){}

    private static Singleton sin;
    static {
        sin = new Singleton();
    }

    public static Singleton getSingleton(){
        return sin;
    }
}