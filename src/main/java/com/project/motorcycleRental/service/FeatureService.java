package com.project.motorcycleRental.service;

import com.project.motorcycleRental.model.Feature;
import com.project.motorcycleRental.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class FeatureService {

    @Autowired
    FeatureRepository featureRepository;

    public List<Feature> getFeatures(){
        return featureRepository.findAll();
    }

    //save new feature
    public void save(Feature feature){
        featureRepository.save(feature);
    }

    //get by id
    public Optional<Feature> findById(Integer id){
        return featureRepository.findById(id);
    }

    public void delete(Integer id){
        featureRepository.deleteById(id);
    }
}
