package com.xlc.flyweight;

public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        User user = new User();
        user.setName("zhangsan");
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(user);

        User user2 = new User();
        user2.setName("lisi");
        WebSite webSite2 = factory.getWebSiteCategory("电影");
        webSite2.use(user2);


        WebSite webSite3 = factory.getWebSiteCategory("电影");
        webSite3.use(user2);


        WebSite webSite4 = factory.getWebSiteCategory("电影");
        webSite4.use(user2);

        WebSite webSite5 = factory.getWebSiteCategory("电影");
        webSite5.use(user2);


        User user3 = new User();
        user3.setName("zjm");

        WebSite webSite6 = factory.getWebSiteCategory("动漫");
        webSite6.use(user3);

        int count = factory.getCount();
        System.out.println(count);


    }



}
