package com.project.motorcycleRental.repository;

import com.project.motorcycleRental.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Booking getBookingByBookingId(Integer bookingId);

    List<Booking> getAllByBookingStatus(String statusIdentifier);



}
