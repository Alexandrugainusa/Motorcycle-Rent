package com.project.motorcycleRental.repository;

import com.project.motorcycleRental.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer> {

    Motorcycle getMotorcycleByMotorcycleId(Integer id);

    List<Motorcycle> getAllByName (String motoName);

    List<Motorcycle> getAllByModel(String model);

}
