package com.flyweightmode;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        User user = new User("百度");
        User user1 = new User("阿里巴巴");
        User user2 = new User("百度爸爸");
        AbstractWebSite webSite = factory.getWebSite("www.baidu.com");
        AbstractWebSite webSite1 = factory.getWebSite("www.taobao.com");
        AbstractWebSite webSite2 = factory.getWebSite("www.baidu.com");
        webSite.use(user);
        webSite1.use(user1);
        webSite2.use(user2);
        System.out.println(factory.getWebSiteNums());
    }
}
