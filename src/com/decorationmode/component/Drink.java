package com.decorationmode.component;

public abstract class Drink {
    /**商品的描述*/
    private String describe;
    /**价格*/
    private float price;

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    /**抽象方法用于计算价格，给子类来实现*/
    public abstract float cost();
}
