package com.xlc.bridge;

public class UpRightPhone extends Phone {


    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直屏手机打开");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直屏手机打电话");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直屏手机关闭");
    }
}
