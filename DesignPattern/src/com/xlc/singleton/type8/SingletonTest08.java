package com.xlc.singleton.type8;

public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }

}


enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok~~~");
    }
}