package com.project.motorcycleRental;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/something")
    public ResponseEntity<String> firstMessage() {
        String s = "First Message";
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
