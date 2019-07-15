package com.singleton.lazyMan;

/**
 *
 */
public class SingletonDemo2 {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println(s1 == s2);
    }
}
class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton2;
    /**当调用getInstance()时，才会创建实例对象*/
    public static synchronized Singleton2 getInstance(){
        if(null == singleton2){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}