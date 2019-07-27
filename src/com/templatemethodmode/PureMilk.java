package com.templatemethodmode;

public class PureMilk extends SoyMilk {
    @Override
    void select() {
        System.out.println("为纯豆浆选择配料");
    }

    @Override
    void add() {

    }

    @Override
    boolean isAdd() {
        return false;
    }
}
