package com.visitormode.person;

import com.visitormode.operation.Review;

public class Woman extends Person {
    @Override
    public void accept(Review review) {
        review.getWomanReview(this);
    }
}
