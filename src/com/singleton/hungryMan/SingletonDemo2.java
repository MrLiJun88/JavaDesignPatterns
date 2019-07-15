package com.singleton.hungryMan;

/**
 * 饿汉式静态代码块
 * 优缺点说明：
 * 1) 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块
 * 中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优
 * 缺点和上面是一样的。
 * 2) 结论：这种单例模式可用，但是可能造成内存浪费
 */
public class SingletonDemo2 {
    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        if(singleton1 == singleton2){
            System.out.println("两个实例对象相等");
        }
    }
}
class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton2;
    /**使用静态代码块来创建实例对象*/
    static {
        singleton2 = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return singleton2;
    }
}