package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AirIndia;


@Repository
public interface HomeRepository extends JpaRepository<AirIndia, Integer>{

}
