package com.prototypemodel.shallowcopy;

public class Sheep implements Cloneable{
    String name;
    int age;
    public Sheep(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Sheep[ name: " + this.name + " age: " + this.age + " ] ";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep = (Sheep)super.clone();
        return sheep;
    }
}
