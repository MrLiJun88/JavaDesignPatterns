package com.buildermodel;

public class Director {
    /**抽象构造者与指挥者是聚合关系*/
    AbstractBuilder builder;
    public Director(AbstractBuilder builder){
        this.builder = builder;
    }
    /**指挥者动态的去指定建造过程*/
    public Product construct(){
        builder.buildBasic();
        builder.buildWall();
        builder.buildRoofed();
        return builder.buildProduct();
    }
}
