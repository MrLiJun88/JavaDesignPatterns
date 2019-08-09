package com.strategymode.strategy;

public class AoDi extends Car {
    public AoDi(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        System.out.println(color + " " + name + "在公路上行驶");
    }
}
