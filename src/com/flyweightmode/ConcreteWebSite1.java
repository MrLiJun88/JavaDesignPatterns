package com.flyweightmode;

public class ConcreteWebSite1 extends AbstractWebSite {
    /**内部状态*/
    String name;
    public ConcreteWebSite1(String name){
        this.name = name;
    }
    @Override
    public void use(User user) {
        System.out.println("网站的名称：" + this.name + " 发布者：" + user.name);
    }
}
