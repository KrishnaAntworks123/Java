package com.example.ReviewService.Repository;

import com.example.ReviewService.models.Reviews;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews,Long> {

}
