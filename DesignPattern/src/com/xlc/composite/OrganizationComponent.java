package com.xlc.composite;

public abstract class OrganizationComponent {

    private String name; //名字
    private String des; // 说明

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    //添加
    public void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    //删除
    public void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public abstract void  print();
}
