package com.prototypemodel.deepcopy.clone;

public class People implements Cloneable{
    String name;
    int age;
    Dog dog;
    public People(String name,int age,Dog dog){
        this.name = name;
        this.age = age;
        this.dog = dog;
    }
    @Override
    public String toString() {
        return "People[ name: " + this.name + " age: " + this.age + " dog: " + this.dog + " ] ";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        People people = null;
        people = (People)super.clone();
        Dog dog = (Dog)people.dog.clone();
        people.dog = dog;
        return people;
    }
}
