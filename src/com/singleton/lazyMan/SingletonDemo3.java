package com.singleton.lazyMan;

/**
 * 双重检查应用实例(推荐使用这种)
 *
 * Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两
 * 次if (singleton == null)检查，这样就可以保证线程安全了。
 * 2) 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，
 * 直接return实例化对象，也避免的反复进行方法同步.
 * 3) 线程安全；延迟加载；效率较高
 * 4) 结论：在实际开发中，推荐使用这种单例设计模式
 */
public class SingletonDemo3 {
    public static void main(String[] args) {
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();

        System.out.println(s1 == s2);
    }
}
class Singleton3 {
    private Singleton3(){}
    /**将实例对象设置成 static volatile */
    private static volatile Singleton3 singleton3;
    public static Singleton3 getInstance(){
        if(null == singleton3){
            synchronized (Singleton3.class){
                /**双重检查应用实例*/
                if(null == singleton3){
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}