package com.templatemethodmode;

public class RedBeansMilk extends SoyMilk {
    @Override
    void select() {
        System.out.println("为红豆豆浆选择配料");
    }

    @Override
    void add() {
        System.out.println("添加红豆，牛奶");
    }
}
