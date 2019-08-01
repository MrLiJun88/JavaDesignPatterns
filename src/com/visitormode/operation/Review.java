package com.visitormode.operation;

import com.visitormode.person.Man;
import com.visitormode.person.Woman;

/**
 * 抽象类：对选手的评论
 */
public abstract class Review {
    /**对男选手的评价*/
    public abstract void getManReview(Man man);
    /**对女选手的评价*/
    public abstract void getWomanReview(Woman woman);
}
