package com.decorationmode.decorator;

import com.decorationmode.component.Drink;

public class Tea extends Decorator {

    public Tea(Drink drink) {
        super(drink);
        this.setDescribe("抹茶");
        this.setPrice(7);
    }
}
