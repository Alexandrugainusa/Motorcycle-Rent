package com.project.motorcycleRental.service;

import com.project.motorcycleRental.dto.MotorcycleDTO;
import com.project.motorcycleRental.model.Motorcycle;
import com.project.motorcycleRental.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MotorcycleService {

    @Autowired
    MotorcycleRepository motorcycleRepository;

    public List<Motorcycle> getMotos(){
        return motorcycleRepository.findAll();
    }

    //save new motorcycle
    public void save(Motorcycle motorcycle){
        motorcycleRepository.save(motorcycle);
    }

    //get by id
    public Optional<Motorcycle> findById(Integer id){
        return motorcycleRepository.findById(id);
    }

    public void delete(Integer id) {
        motorcycleRepository.deleteById(id);
    }



//    public Motorcycle getMotorcycleById(Integer id){
//        return motorcycleRepository.getMotorcycleByMotorcycleId(id);
//    }
//
//    public List<MotorcycleDTO> getMotorcycles(){
//        List<Motorcycle> all = motorcycleRepository.findAll();
//        return convertToDTOs(all);
//    }
//
//    private List<MotorcycleDTO> convertToDTOs(List<Motorcycle> motorcycles){
//        List<MotorcycleDTO> motorcycleDTOS = new ArrayList<>();
//
//        for (Motorcycle m: motorcycles) {
//            motorcycleDTOS.add(new MotorcycleDTO(m.getMotorcycleId(), m.getName(), m.getModel(),
//                    m.getAmount(),m.getLocationId(),m.getMotorcycleStatus()));
//        }
//        return motorcycleDTOS;
//    }


}
