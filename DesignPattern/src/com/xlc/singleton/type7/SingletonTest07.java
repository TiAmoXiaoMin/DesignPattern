package com.xlc.singleton.type7;

public class SingletonTest07{
    public static void main(String[] args) {
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

    private static volatile Singleton singleton;

    public static synchronized Singleton getSingleton(){

        return SingletonInstance.singleton;
    }


    private static class SingletonInstance{

        private static final Singleton singleton = new Singleton();

    }
}
