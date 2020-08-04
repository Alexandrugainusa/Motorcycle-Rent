package com.project.motorcycleRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotorcyclesParametersController {

    @GetMapping("/motorcycleparameters")
    public String getMotorycleParameters(){
        return "motorcycleparameters";
    }
}
