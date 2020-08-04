package com.project.motorcycleRental.service;

import com.project.motorcycleRental.model.Location;
import com.project.motorcycleRental.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public List<Location> getLocation(){
        return locationRepository.findAll();
    }

    //save new location
    public void save(Location location){
        locationRepository.save(location);
    }

    //get by id
    public Optional<Location> findById(Integer id){
        return locationRepository.findById(id);
    }

    public void delete(Integer id) {
        locationRepository.deleteById(id);
    }
}
