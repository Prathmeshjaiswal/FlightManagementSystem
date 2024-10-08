package com.spring.repository;

import com.spring.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// AirportRepository.java
public interface AirportRepository extends JpaRepository<Airport, Integer> {
    List<Airport> findByCity(String city);
    List<Airport> findByCountry(String country);
}
