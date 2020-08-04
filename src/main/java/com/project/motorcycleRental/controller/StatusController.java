package com.project.motorcycleRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {

    @GetMapping("/status")
    public String getStatus(){
        return "status";
    }
}