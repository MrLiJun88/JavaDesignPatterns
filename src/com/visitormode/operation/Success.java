package com.visitormode.operation;

import com.visitormode.person.Man;
import com.visitormode.person.Woman;

public class Success extends Review  {
    @Override
    public void getManReview(Man man) {
        System.out.println("男选手的评价是成功");
    }

    @Override
    public void getWomanReview(Woman woman) {
        System.out.println("女选手的评价是成功");
    }
}
