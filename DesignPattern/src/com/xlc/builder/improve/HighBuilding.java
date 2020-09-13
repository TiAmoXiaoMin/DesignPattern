package com.xlc.builder.improve;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("建造高楼地基10米");
    }

    @Override
    public void buildWall() {
        System.out.println("建造高楼墙500米");
    }

    @Override
    public void roofed() {
        System.out.println("建造高楼墙顶");
    }
}
