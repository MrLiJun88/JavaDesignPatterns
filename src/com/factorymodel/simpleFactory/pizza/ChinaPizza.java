package com.factorymodel.simpleFactory.pizza;

public class ChinaPizza extends Pizza {
    String name;
    public ChinaPizza(String name){
        this.name = name;
        this.prepare();
        this.make();
    }
    @Override
    public void prepare() {
        System.out.println(name + " 披萨在准备中");
    }

    @Override
    public void make() {
        System.out.println(name + " 披萨已经做好");
    }
}
