package com.project.motorcycleRental.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "features")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "featuresId")
    private int featuresId;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "featureList")
    private List<Motorcycle> motorcycleList;

    public Feature() {
        super();
    }


    public Feature(int featuresId, String description, List<Motorcycle> motorcycleList) {
        this.featuresId = featuresId;
        this.description = description;
        this.motorcycleList = motorcycleList;
    }

    public int getFeaturesId() {
        return featuresId;
    }

    public void setFeaturesId(int featuresCode) {
        this.featuresId = featuresId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "featuresCode='" + featuresId + '\'' +
                ", description='" + description + '\'' +
               // ", motorcycleList='" + motorcycleList + '\'' +
                '}';
    }
}
