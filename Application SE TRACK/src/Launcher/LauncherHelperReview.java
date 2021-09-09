package Launcher;

import entity.Review;
import helperClasses.HelperReview;

import java.util.Scanner;

public class LauncherHelperReview {
    public static void main(String[] args) {
        // declare a review
        Review review = new Review();
        review.setId(1L);
        review.setSessionId(1L);
        review.setComment("comment");
        // show that review has is not a rating yet
        System.out.println(review);

        // create scanner to ask for review
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide a rating: ");

        // declare rating by capturing the input
        int rating = input.nextInt();

        // use a Helper-class (named HelperReview), declare, so we can use methods
        HelperReview helperReview = new HelperReview();

        // if "rating" is between 1 and 10, then the rating will be set into review, else it says the println
        if (helperReview.isValidInteger1(rating, 1, 10)) {
            review.setRating(rating);
        } else System.out.println("rating must be between 1-10");

        // show that review contains a rating, if succeeded
        System.out.println(review);

    }
}
