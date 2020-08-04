package com.project.motorcycleRental.controller;

import com.project.motorcycleRental.model.Booking;
import com.project.motorcycleRental.service.BookingService;
import com.project.motorcycleRental.service.LocationService;
import com.project.motorcycleRental.service.MotorcycleService;
import com.project.motorcycleRental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;
    @Autowired
    MotorcycleService motorcycleService;
    @Autowired
    LocationService locationService;
    @Autowired
    UserService userService;

    @GetMapping("/bookings")
    public String getBookings(Model model){
//        List<Booking> bookingList = bookingService.getBookings();
        model.addAttribute("bookings", bookingService.getBookings());
        model.addAttribute("motorcycle", motorcycleService.getMotos());
        model.addAttribute("location", locationService.getLocation());
        model.addAttribute("users", userService.getUser());

        return "bookings";
    }

    @PostMapping("/bookings/addNew")
    public String addNew(Booking booking){
        bookingService.save(booking);
        return "redirect:/bookings";
    }

    @RequestMapping("/bookings/findById")
    @ResponseBody
    public Optional<Booking> findById(Integer id){
        return bookingService.findById(id);
    }

    @RequestMapping(value = "/bookings/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Booking booking) {
        bookingService.save(booking);
        return "redirect:/bookings";
    }

    @RequestMapping(value = "/bookings/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id) {
        bookingService.delete(id);
        return "redirect:/bookings";
    }

}
