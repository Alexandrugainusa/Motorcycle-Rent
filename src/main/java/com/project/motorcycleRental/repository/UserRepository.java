package com.project.motorcycleRental.repository;

import com.project.motorcycleRental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findFirstByUsername(String login);

    User findFirstByEmail(String email);

    User getUserByUserId(Integer id);

    User getUserByEmail(String email);

    User getByEmailAndPassword(String email, String password);




}
