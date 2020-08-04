package com.project.motorcycleRental.service;


import com.project.motorcycleRental.model.User;
import com.project.motorcycleRental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUser(){
        return userRepository.findAll();
    }

    //save new user
    public void save(User user){
        userRepository.save(user);
    }

    //get by id
    public Optional<User> findById(Integer id){
        return userRepository.findById(id);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }


    public User findFirstByLogin(String login){
      return   userRepository.findFirstByUsername(login);
    }

    public User getUserById(Integer id){
        return userRepository.getUserByUserId(id);
    }


}
