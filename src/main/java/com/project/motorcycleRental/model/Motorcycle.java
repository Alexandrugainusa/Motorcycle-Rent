package com.project.motorcycleRental.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "motorcycle")
public class Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motorcycleId")
    private int motorcycleId;

    @Column(name = "motorcycleName")
    private String name;

    @Column(name = "motorcycleModel")
    private String model;

    @Column(name = "motorcycleType")
    private String type;

    @Column(name = "motorcycleAmount")
    private int amount;

    @Column(name = "motorcycleLocationId")
    private int locationId;

    @Column(name = "motorcycleStatus")
    private String motorcycleStatus;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "motorcycleFeatures", joinColumns = @JoinColumn(name = "motoFeatureId"), inverseJoinColumns = @JoinColumn(name = "featureId"))
    private List<Feature> featureList;

    @OneToOne(mappedBy = "motorcycle")
    private MotorcycleParameters motorcycleParameters;

    @OneToMany(mappedBy = "motorcycle", fetch=FetchType.EAGER)
    private Set<Comment> comments;

    public Motorcycle() {
        super();
    }

    public Motorcycle(int motorcycleId, String name, String model, String type, int amount,
                      int locationId, String motorcycleStatus) {
        this.motorcycleId = motorcycleId;
        this.name = name;
        this.model = model;
        this.type = type;
        this.amount = amount;
        this.locationId = locationId;
        this.motorcycleStatus = motorcycleStatus;
    }

    public int getMotorcycleId() {
        return motorcycleId;
    }

    public void setMotorcycleId(int motorcycleId) {
        this.motorcycleId = motorcycleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getMotorcycleStatus() {
        return motorcycleStatus;
    }

    public void setMotorcycleStatus(String motorcycleStatus) {
        this.motorcycleStatus = motorcycleStatus;
    }

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }

    public MotorcycleParameters getMotorcycleParameters() {
        return motorcycleParameters;
    }

    public void setMotorcycleParameters(MotorcycleParameters motorcycleParameters) {
        this.motorcycleParameters = motorcycleParameters;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleId=" + motorcycleId +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", locationId=" + locationId +
                ", motorcycleStatus='" + motorcycleStatus + '\'' +
                ", featureList=" + featureList +
                ", motorcycleParameters=" + motorcycleParameters +
                '}';
    }
}
