package com.xlc.singleton.type4;

public class SingletonTest05{
    public static void main(String[] args) {
        System.out.println("懒汉式 线程安全，同步代码块");
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton);
        System.out.println("singleton hashcode is" + singleton.hashCode());
        System.out.println("singleton hashcode2 is" + singleton2.hashCode());
        System.out.println("singleton hashcode is" + singleton);
        System.out.println("singleton hashcode2 is" + singleton2);
    }
}

class Singleton2{

    private Singleton2(){}

    private static Singleton2 singleton;

    public static synchronized Singleton2 getSingleton(){
        if(singleton == null){

            synchronized (Singleton2.class){
                singleton = new Singleton2();
            }
        }
        return singleton;
    }

}