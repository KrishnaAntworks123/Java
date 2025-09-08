package com.example.ReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Driver extends BaseModel {
    private String name;

    @Column(unique = true, nullable = false)
    private String licenseNumber;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings=new ArrayList<Booking>();
}
