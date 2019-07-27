package com.templatemethodmode;

public class CoffeeMilk extends SoyMilk {
    @Override
    void select() {
        System.out.println("为咖啡豆浆选择配料");
    }

    @Override
    void add() {
        System.out.println("添加咖啡，焦糖");
    }
}
