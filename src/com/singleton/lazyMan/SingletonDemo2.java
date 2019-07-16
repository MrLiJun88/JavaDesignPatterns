package com.singleton.lazyMan;

/**
 * 用 synchronized 来保证了懒汉式单例模式的线程安全，但效率太低
 *优缺点说明：
 * 1) 解决了线程不安全问题
 * 2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行
 * 同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，
 * 直接return就行了。方法进行同步效率太低
 * 3) 结论：在实际开发中，不推荐使用这种方式
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