package com.strategymode.strategy;

public class BaoMa extends Car {

    public BaoMa(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        System.out.println(color + " " + name + "在雪地上行驶");
    }
}
