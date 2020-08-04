package com.project.motorcycleRental.service;

import com.project.motorcycleRental.model.Booking;
import com.project.motorcycleRental.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    // list of bookings
    public List<Booking> getBookings(){
        return bookingRepository.findAll();
    }

    //save booking
    public void save(Booking booking){
        bookingRepository.save(booking);
    }

    //get by id
    public Optional<Booking> findById(int id){
        return bookingRepository.findById(id);
    }

    //delete booking
    public void delete(Integer id){
        bookingRepository.deleteById(id);
    }
}
