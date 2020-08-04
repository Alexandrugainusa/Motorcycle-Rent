package com.project.motorcycleRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRolesController {

    @GetMapping("/userroles")
    public String getUserRoles(){
        return "userroles";
    }
}
