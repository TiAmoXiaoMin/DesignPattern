package com.xlc.builder;

public abstract class AbstractHouse {

    //打地基
    public abstract void buildBaisc();

    //砌墙
    public abstract void buildWall();

    //该房顶
    public abstract void roofed();

    public void build(){
        buildBaisc();
        buildWall();
        roofed();

    }
}
