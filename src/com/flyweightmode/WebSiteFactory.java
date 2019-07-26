package com.flyweightmode;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类
 */
public class WebSiteFactory {
    /**用集合充当池的作用*/
    Map<String,AbstractWebSite> pool = new HashMap<>();
    /**根据网站的名称，返回该网站，如果没有则创建该网站并放入池中，类似于String池*/
    public AbstractWebSite getWebSite(String name){
        /**如果没有则创建一个并放入池中*/
        if(!pool.containsKey(name)){
            pool.put(name,new ConcreteWebSite1(name));
        }
        /**存在则直接返回*/
        return (AbstractWebSite)pool.get(name);
    }
    /**获取网站分类的总数*/
    public int getWebSiteNums(){
        return pool.size();
    }
}
