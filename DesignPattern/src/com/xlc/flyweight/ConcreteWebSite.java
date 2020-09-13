package com.xlc.flyweight;

public class ConcreteWebSite extends WebSite{

    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布的形式为:" + type +"发布者为:"+user.getName());
    }
}
