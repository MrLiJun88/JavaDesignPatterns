package com.visitormode.operation;

import com.visitormode.person.Man;
import com.visitormode.person.Woman;

public class Wait extends Review {
    @Override
    public void getManReview(Man man) {
        System.out.println("男选手评价待定");
    }

    @Override
    public void getWomanReview(Woman woman) {
        System.out.println("女选手评价待定");
    }
}
