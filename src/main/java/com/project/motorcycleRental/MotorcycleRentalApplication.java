package com.project.motorcycleRental;

import com.project.motorcycleRental.model.User;
import com.project.motorcycleRental.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.List;

@SpringBootApplication
public class MotorcycleRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotorcycleRentalApplication.class, args);


//        UserRepository userRepository = run.getBean(UserRepository.class);
//        User byLogin = userRepository.getUserByLogin("alexmann");
//        System.out.println(byLogin);
    }

}
