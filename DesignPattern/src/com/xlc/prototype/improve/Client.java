package com.xlc.prototype.improve;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"black");
        sheep.friend = new Sheep("tom",2,"black");
        Sheep sheep2 =(Sheep) sheep.clone();
        Sheep sheep3 =(Sheep) sheep.clone();
        Sheep sheep4 =(Sheep) sheep.clone();
        Sheep sheep5 =(Sheep) sheep.clone();
        System.out.println(sheep );
        System.out.println(sheep2 + "sheep2.friend:" + sheep2.friend.hashCode());
        System.out.println(sheep3 + "sheep2.friend:" + sheep2.friend.hashCode());
        System.out.println(sheep4 + "sheep2.friend:" + sheep2.friend.hashCode());
        System.out.println(sheep5 + "sheep2.friend:" + sheep2.friend.hashCode());
    }

}
