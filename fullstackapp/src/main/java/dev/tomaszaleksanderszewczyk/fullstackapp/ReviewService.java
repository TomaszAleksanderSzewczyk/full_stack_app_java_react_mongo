package dev.tomaszaleksanderszewczyk.fullstackapp;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {
public Review createReview(String reviewBody, String imdbId){

    Review review = new Review(reviewBody);
    return review;
}
}
