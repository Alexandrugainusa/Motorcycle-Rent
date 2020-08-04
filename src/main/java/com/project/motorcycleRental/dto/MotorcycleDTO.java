package com.project.motorcycleRental.dto;



public class MotorcycleDTO {



    private Integer id;
    private String name;
    private String model;
    private Double amount;
    private Integer location;
    private String motorcycleStatus;

    private String motorcycleYear;
    private String colour;
    private String mileage;
    private String transmission;

    public MotorcycleDTO() {
        super();
    }

    public MotorcycleDTO(Integer id, String name, String model, Double amount, Integer location,
                         String motorcycleStatus, String motorcycleYear, String colour, String mileage,
                         String transmission) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.amount = amount;
        this.location = location;
        this.motorcycleStatus = motorcycleStatus;
        this.motorcycleYear = motorcycleYear;
        this.colour = colour;
        this.mileage = mileage;
        this.transmission = transmission;
    }

    public MotorcycleDTO(int motorcycleId, String name, String model, double amount, Integer location, String motorcycleStatus) {
        this.id = motorcycleId;
        this.name = name;
        this.model = model;
        this.amount = amount;
        this.location = location;
        this.motorcycleStatus = motorcycleStatus;

    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getMotorcycleStatus() {
        return motorcycleStatus;
    }

    public void setMotorcycleStatus(String motorcycleStatus) {
        this.motorcycleStatus = motorcycleStatus;
    }

    public String getMotorcycleYear() {
        return motorcycleYear;
    }

    public void setMotorcycleYear(String motorcycleYear) {
        this.motorcycleYear = motorcycleYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "MotorcycleDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", amount=" + amount +
                ", location=" + location +
                ", motorcycleStatus='" + motorcycleStatus + '\'' +
                ", motorcycleYear='" + motorcycleYear + '\'' +
                ", colour='" + colour + '\'' +
                ", mileage='" + mileage + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
