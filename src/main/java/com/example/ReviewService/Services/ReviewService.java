package com.example.ReviewService.Services;

import com.example.ReviewService.Repository.BookingRepository;
import com.example.ReviewService.Repository.ReviewRepository;
import com.example.ReviewService.models.Booking;
import com.example.ReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository=reviewRepository;
        this.bookingRepository=bookingRepository;
    }
    @Override
    public void run(String... arg){
        Review r=Review.builder().content("Amazing").rating(2.5).build();
        Booking b= Booking.builder().endTime(new Date()).Review(r).build();
        System.out.println(r.toString());
        reviewRepository.save(r);
        bookingRepository.save(b);
    }
}
