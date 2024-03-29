package com.singleton.staticInnerClass;

/**
 *静态内部类(推荐使用,外部类的加载，不会导致它的内部静态内部类的加载)
 * 优缺点说明：
 * 1) 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * 2) 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化
 * 时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的
 * 实例化。
 * 3) 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们
 * 保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 4) 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 5) 结论：推荐使用
 */
public class SingletonDemo1 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1 == s2);
    }
}
class Singleton1 {
    /**构造器私有化*/
    private Singleton1(){}
    /**
     * 当外部类Singleton1被加载时，静态内部类SingleInstance不会被加载
     */
    private static class SingleInstance {
        private static final Singleton1 INSTANCE = new Singleton1();
    }
    /**当调用 getInstance方法时，静态内部类才会被加载*/
    public static Singleton1 getInstance(){
        return SingleInstance.INSTANCE;
    }
}