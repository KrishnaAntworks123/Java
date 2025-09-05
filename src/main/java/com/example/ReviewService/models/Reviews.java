package com.example.ReviewService.models;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "BookingReviews")
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Reviews extends BaseModel {

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Double rating;

    @Override
    public String toString(){ return "Reviews " + this.content + " " + this.rating + " " + this.createdAt; }

}