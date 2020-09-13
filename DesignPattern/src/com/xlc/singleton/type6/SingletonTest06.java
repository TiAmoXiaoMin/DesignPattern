package com.xlc.singleton.type6;

public class SingletonTest06{
    public static void main(String[] args) {
        System.out.println("双重检查");
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

        if(singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}