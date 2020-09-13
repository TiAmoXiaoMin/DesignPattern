package com.xlc.composite;

public class Client {

    public static void main(String[] args) {
       OrganizationComponent un = new University("清华大学","最高学府");

        OrganizationComponent computerCCollage = new Collage("计算机专业","计算机专业");
        OrganizationComponent graphicCollage = new Collage("网络专业","网络专业");
        un.add(computerCCollage);
        un.add(graphicCollage);
        computerCCollage.add(new Department("软件开发 ","软件开发"));
        computerCCollage.add(new Department("网络工程 ","网络工程"));

        graphicCollage.add(new Department("网络工程学习","网络工程学习"));

        un.print();
    }
}
