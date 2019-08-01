package com.visitormode.person;

import com.visitormode.operation.Review;

public class Man extends Person {
    @Override
    public void accept(Review review) {
        review.getManReview(this);
    }
}
