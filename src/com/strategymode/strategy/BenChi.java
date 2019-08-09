package com.strategymode.strategy;

public class BenChi extends Car {
    public BenChi(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        System.out.println(color + " " + name + "在沙漠上行驶");
    }
}
