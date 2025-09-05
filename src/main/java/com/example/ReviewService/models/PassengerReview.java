package com.example.ReviewService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PassengerReviews")
public class PassengerReview extends Reviews {
    public String PassengerReviewContent;
}
