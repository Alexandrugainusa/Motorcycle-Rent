package com.project.motorcycleRental.dto;

import java.io.Serializable;

public class MotorcycleFilterDTO implements Serializable {

    private String name;
    private String model;
    private String city;
    private Double priceFrom;
    private Double priceTo;
    private Integer productionYearFrom;
    private Integer productionYearTo;
    private String color;
    private String transmission;

    public MotorcycleFilterDTO() {
        super();
    }

    public MotorcycleFilterDTO(String name, String model, String city, Double priceFrom, Double priceTo,
                               Integer productionYearFrom, Integer productionYearTo, String color,
                               String transmission) {
        this.name = name;
        this.model = model;
        this.city = city;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.productionYearFrom = productionYearFrom;
        this.productionYearTo = productionYearTo;
        this.color = color;
        this.transmission = transmission;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Double priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Double getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(Double priceTo) {
        this.priceTo = priceTo;
    }

    public Integer getProductionYearFrom() {
        return productionYearFrom;
    }

    public void setProductionYearFrom(Integer productionYearFrom) {
        this.productionYearFrom = productionYearFrom;
    }

    public Integer getProductionYearTo() {
        return productionYearTo;
    }

    public void setProductionYearTo(Integer productionYearTo) {
        this.productionYearTo = productionYearTo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "MotorcycleFilterDTO{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", city='" + city + '\'' +
                ", priceFrom=" + priceFrom +
                ", priceTo=" + priceTo +
                ", productionYearFrom=" + productionYearFrom +
                ", productionYearTo=" + productionYearTo +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
