package com.project.motorcycleRental.controller;

import com.project.motorcycleRental.model.Location;
import com.project.motorcycleRental.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@ComponentScan()
public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping("/location")
    public String getLocations(Model model){
        List<Location> locationList = locationService.getLocation();

        model.addAttribute("location",locationList);
        return "location";
    }

    @PostMapping("/location/addNew")
    public String addNew(Location location){
        locationService.save(location);
        return "redirect:/location";
    }

    @RequestMapping("/location/findById")
    @ResponseBody
    public Optional<Location> findById(Integer id){
       return locationService.findById(id);
    }

    @RequestMapping(value = "/location/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Location location) {
        locationService.save(location);
        return "redirect:/location";
    }

    @RequestMapping(value = "/location/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id) {
        locationService.delete(id);
        return "redirect:/location";
    }
}
