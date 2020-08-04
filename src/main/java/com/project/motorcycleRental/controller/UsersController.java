package com.project.motorcycleRental.controller;

import com.project.motorcycleRental.model.Location;
import com.project.motorcycleRental.model.User;
import com.project.motorcycleRental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model){
        List<User> userList = userService.getUser();
        model.addAttribute("users",userList);
        return "users";
    }

    @PostMapping("/users/addNew")
    public String addNew(User user){
        userService.save(user);
        return "redirect:/users";
    }

    @RequestMapping("/users/findById")
    @ResponseBody
    public Optional<User> findById(Integer id){
        return userService.findById(id);
    }

    @RequestMapping(value = "/users/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/users/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
