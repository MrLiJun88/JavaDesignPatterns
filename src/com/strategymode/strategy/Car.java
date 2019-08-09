package com.strategymode.strategy;

public class Car implements CarFunction {
    String name;
    String color;
    public Car(String name,String color){
        this.name = name;
        this.color = color;
    }
    @Override
    public void run() {
        System.out.println(color + " " + name + " 在行驶");
    }
}
