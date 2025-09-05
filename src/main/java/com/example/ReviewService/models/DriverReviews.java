package com.example.ReviewService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DriverReviews")
public class DriverReviews extends Reviews {
    public String DriverReviewContent;
}
