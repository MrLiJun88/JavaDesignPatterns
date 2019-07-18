package com.prototypemodel.deepcopy.clone;

public class Dog implements Cloneable{
    String name;
    public Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog[ name: " + this.name + " ] ";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Dog dog = null;
        dog = (Dog)super.clone();
        return dog;
    }
}
