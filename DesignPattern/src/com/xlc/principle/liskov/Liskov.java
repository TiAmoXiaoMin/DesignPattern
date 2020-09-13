package com.xlc.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
      //  System.out.println(a.fun1(1,2));

        B b = new B();
//        System.out.println(b.fun1(3,1));
//        System.out.println(b.fun2(6,6));
        System.out.println(b.fun3(1,1));
    }
}

class Base{

}

class A extends Base{
    public int fun1(int a,int b){
        return a+b;
    }
}

class B extends Base{

    private A a = new A();

    public int fun1(int a,int b){
        return a - b;
    }

    public int fun2(int a,int b){
        return (a+b)+1;
    }

    public int fun3(int a,int b){
        return this.a.fun1( a, b);
    }

}