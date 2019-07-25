package com.decorationmode.decorator;

import com.decorationmode.component.Drink;

public class Decorator extends Drink {
    private Drink drink;
    /**构造器*/
    public Decorator(Drink drink){
        this.drink = drink;
    }
    @Override
    public float cost() {
        /**自己的价格+组和物品的价格*/
        return super.getPrice() + drink.getPrice();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " 价格：" + super.getPrice() + " && " + drink.getDescribe();
    }
}
