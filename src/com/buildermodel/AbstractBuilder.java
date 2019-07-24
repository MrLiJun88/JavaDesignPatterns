package com.buildermodel;

public abstract class AbstractBuilder {
    /**产品与抽象构造者是组合关系*/
    Product product = new Product();
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoofed();

    public Product buildProduct(){
        return product;
    }

}
