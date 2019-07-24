package com.prototypemodel.deepcopy.serialize;

import java.io.*;

/**
 * 利用序列化来做深复制：
 *  把对象写到流里的过程是序列化(Serilization)过程，
 *  而把对象从流中读出来的过程则叫做反序列化过程。
 *  应当指出的是，写在流里的是对象的一个拷贝，而原对象仍然存在于JVM中。
 * 在Java语言里深复制一个对象，常常可以先使对象实现Serializable接口，
 * 然后把对象（实际上只是对象的一个拷贝）写到一个流里，再从流里读出来，便可以重建对象。
 * 这样做的前提是对象以及对象内部所有引用到的对象都是可串行化的
 * 否则，就需要仔细考察那些不可串行的对象可否设成 transient,从而将之排除在复制过程之外。
 */
public class DeepCopyBySerializable {
    public static void main(String[] args) throws Exception{
        Dog dog = new Dog("wangcai");
        People people = new People("wangwu",27,dog);

        People people2 = (People)people.getDeepCopyObject();
        people.name = "wnagwudeBaBa";
        people.dog.name = "sogou";
        System.out.println(people);
        System.out.println(people2);
    }
}
