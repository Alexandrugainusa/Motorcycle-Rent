package com.project.motorcycleRental.controller;

import com.project.motorcycleRental.dto.MotorcycleDTO;
import com.project.motorcycleRental.model.Location;
import com.project.motorcycleRental.model.Motorcycle;
import com.project.motorcycleRental.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MotorcycleController {

    @Autowired
    MotorcycleService motorcycleService;

    @GetMapping("/motorcycle")
    public String getMotorcycles(Model model){
        List<Motorcycle> motorcycleList = motorcycleService.getMotos();
        model.addAttribute("motorcycle",motorcycleList);
        return "motorcycle";
    }

    @PostMapping("/motorcycle/addNew")
    public String addNew(Motorcycle motorcycle){
        motorcycleService.save(motorcycle);
        return "redirect:/location";
    }

    @RequestMapping("/motorcycle/findById")
    @ResponseBody
    public Optional<Motorcycle> findById(Integer id){
        return motorcycleService.findById(id);
    }

    @RequestMapping(value = "/motorcycle/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Motorcycle motorcycle) {
        motorcycleService.save(motorcycle);
        return "redirect:/motorcycle";
    }

    @RequestMapping(value = "/motorcycle/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id) {
        motorcycleService.delete(id);
        return "redirect:/motorcycle";
    }



    @GetMapping("/choppers")
    public String getChoppers(){
        return "choppers";
    }

    @GetMapping("/tourings")
    public String getTourings(){
        return "tourings";
    }

    @GetMapping("/speeders")
    public String getSpeeders(){
        return "speeders";
    }
}
