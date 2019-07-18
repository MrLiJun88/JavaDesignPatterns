package com.prototypemodel.deepcopy.clone;

/**
 * 浅复制：
 * 被复制对象的所有变量都含有与原来的对象相同的值，
 * 而所有的对其他对象的引用仍然指向原来的对象。
 * 换言之，浅复制仅仅复制所考虑的对象，而不是复制它所引用的对象
 *
 * 深复制：
 * 被复制对象的所有变量都含有与原来的对象相同的值，
 * 除去那些引用其他对象的变量。那些引用其他对象的变量将指向被复制过后新对象
 * 而不再是原有的那些被引用的对象。
 * 换言之，深复制把要复制的对象所引用的对象都复制一遍。
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Dog dog1 = new Dog("wangcai");
        People p1 = new People("lijun",22,dog1);
        People p2 = (People) p1.clone();
        p1.dog.name = "hello";
        System.out.println(p1);
        System.out.println(p2);
    }
}
