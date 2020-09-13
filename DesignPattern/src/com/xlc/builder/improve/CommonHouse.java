package com.xlc.builder.improve;

// 产品建造
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("构建普通房子地基5米");
    }

    @Override
    public void buildWall() {
        System.out.println("构建普通房子墙20米");
    }

    @Override
    public void roofed() {
        System.out.println("构建普通房子屋顶");
    }
}
