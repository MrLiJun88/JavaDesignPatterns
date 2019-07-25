package com.decorationmode;

import com.decorationmode.component.Drink;
import com.decorationmode.component.LoveCoffee;
import com.decorationmode.decorator.Mango;
import com.decorationmode.decorator.Tea;

public class Client {
    public static void main(String[] args) {
        Drink coffee = new LoveCoffee();
        Drink order = new Mango(coffee);
        Drink tea = new Tea(order);
        Drink tea2 = new Tea(tea);
        System.out.println(tea2.getDescribe());
    }
}
