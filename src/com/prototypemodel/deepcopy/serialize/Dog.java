package com.prototypemodel.deepcopy.serialize;

import java.io.Serializable;

public class Dog implements Serializable {
    String name;
    public Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog[ name: " + this.name + " ] ";
    }

}
