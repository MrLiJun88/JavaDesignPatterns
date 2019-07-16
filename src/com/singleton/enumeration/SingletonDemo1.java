package com.singleton.enumeration;

/**
 * 枚举实现单例模式
 *
 *这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而
 * 且还能防止反序列化重新创建新的对象。
 * 2) 这种方式是Effective Java作者Josh Bloch 提倡的方式
 * 3) 结论：推荐使用
 */
public class SingletonDemo1 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println(s1 == s2);
        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
    }
}
