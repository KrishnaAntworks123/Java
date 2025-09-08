package com.example.ReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Passenger extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings=new ArrayList<Booking>();
}
