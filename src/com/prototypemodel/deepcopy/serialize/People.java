package com.prototypemodel.deepcopy.serialize;

import java.io.*;

public class People implements Serializable {
    String name;
    int age;
    Dog dog;
    public People(String name, int age, Dog dog){
        this.name = name;
        this.age = age;
        this.dog = dog;
    }
    @Override
    public String toString() {
        return "People[ name: " + this.name + " age: " + this.age + " dog: " + this.dog + " ] ";
    }

    public Object getDeepCopyObject() throws Exception{
        /**进行序列化*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        /**将当前对象写入到对象流中*/
        oos.writeObject(this);
        /**进行反序列化*/
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        /**将当前对象从对象流中读出，并返回*/
        return ois.readObject();
    }
}
