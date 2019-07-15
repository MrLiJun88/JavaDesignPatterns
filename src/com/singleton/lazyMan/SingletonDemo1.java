package com.singleton.lazyMan;

/**
 * 单例模式：懒汉式
 *优缺点说明：
 * 1) 起到了Lazy Loading的效果，但是只能在单线程下使用。
 * 2) 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及
 * 往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以
 * 在多线程环境下不可使用这种方式
 * 3) 结论：在实际开发中，不要使用这种方式
 */
public class SingletonDemo1 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        if(s1 == s2){
            System.out.println("两个实例对象相等");
        }
    }
}
class Singleton1 {
    private Singleton1(){}
    private static Singleton1 singleton1;
    /**当调用getInstance()时，才会创建实例对象*/
    public static Singleton1 getInstance(){
        if(null == singleton1){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}