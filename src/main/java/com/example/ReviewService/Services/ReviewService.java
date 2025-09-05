package com.example.ReviewService.Services;

import com.example.ReviewService.Repository.ReviewRepository;
import com.example.ReviewService.models.Reviews;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }
    @Override
    public void run(String... arg){
        Reviews r=Reviews.builder().content("Amazing").rating(2.5).build();
        System.out.println(r.toString());
        reviewRepository.save(r); //This code execute SQL query
    }
}
