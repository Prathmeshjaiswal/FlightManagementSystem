package com.spring.repository;

import com.spring.model.Booking;
import com.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface BookingRepository extends JpaRepository<Booking,Integer> {



}