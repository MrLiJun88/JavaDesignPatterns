package com.strategymode;

import com.strategymode.strategy.Car;

/**
 * 上下文类
 */
public class Person {
    String name;
    int age;
    Car car;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void driver(Car car){
        System.out.print(name + " " + age + "岁 在开着 ");
        car.run();
    }
}
