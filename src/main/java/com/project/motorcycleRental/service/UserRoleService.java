package com.project.motorcycleRental.service;

import com.project.motorcycleRental.model.UserRole;
import com.project.motorcycleRental.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRoleService {

    @Autowired
    UserRoleRepository userRoleRepository;

    public UserRole getUserRoleById(Integer id){
        return userRoleRepository.getAllByUserRoleId(id);
    }
}
