package com.project.motorcycleRental.repository;

import com.project.motorcycleRental.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

    UserRole getAllByUserRoleId(Integer id);

}
