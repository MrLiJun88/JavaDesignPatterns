package com.factorymodel.abstractfactory.pizza;

public class BJGeekPizza extends Pizza {
    String name;
    public BJGeekPizza(String name){
        this.name = name;
        this.prepare();
        this.make();
    }
    @Override
    public void prepare() {
        System.out.println("正在准备 " + name + " 的披萨");
    }

    @Override
    public void make() {
        System.out.println(name + "披萨已做好");
    }
}
