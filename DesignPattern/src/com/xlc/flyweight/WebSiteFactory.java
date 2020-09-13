package com.xlc.flyweight;

import java.util.HashMap;
import java.util.Map;


//网站工厂类，根据需要返回压一个网站
public class WebSiteFactory {

    private Map<String,ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type){

        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }


public int getCount(){
    int size = pool.size();
    return size;
}



}
