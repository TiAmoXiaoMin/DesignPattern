package com.xlc.builder.improve;

public class Client {
    public static void main(String[] args) {
        //普通房子的构建
        CommonHouse commonHouse = new CommonHouse();
        new HouseDirector(commonHouse).constructHouse();

        System.out.println("==================================");
        //高楼的构建
        HighBuilding highBuilding = new HighBuilding();
        new HouseDirector(highBuilding).constructHouse();

    }
}
