package com.xlc.builder.improve;

// 产品构建
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    public House buildHouse(){
        return new House();
    }
}
