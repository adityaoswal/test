package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Passenger;

@Repository
public interface HomeRepository extends JpaRepository<Passenger, Integer> {

}
