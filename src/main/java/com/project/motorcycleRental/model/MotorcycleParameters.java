package com.project.motorcycleRental.model;

import javax.persistence.*;

@Entity
@Table(name = "motorcycleParameters")
public class MotorcycleParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parametersId")
    private int parametersId;

    @Column(name = "motorcycleYear")
    private String motorcycleYear;

    @Column(name = "motorcycleColour")
    private String motorcycleColour;

    @Column(name = "motorcycleMileAge")
    private String mileage;

    @Column(name = "transmissionType")
    private String transmission;

    @OneToOne(fetch = FetchType.LAZY) // ia entitatea din baza de date cand se apeleaza metoda get();
    @JoinColumn(name = "parametersId")
    private Motorcycle motorcycle;

    public MotorcycleParameters() {
        super();
    }

    public MotorcycleParameters(int parametersId, String motorcycleYear, String motorcycleColour, String mileage,
                                String transmission, Motorcycle motorcycle) {
        this.parametersId = parametersId;
        this.motorcycleYear = motorcycleYear;
        this.motorcycleColour = motorcycleColour;
        this.mileage = mileage;
        this.transmission = transmission;
        this.motorcycle = motorcycle;
    }

    public int getParametersId() {
        return parametersId;
    }

    public void setParametersId(int parametersId) {
        this.parametersId = parametersId;
    }

    public String getMotorcycleYear() {
        return motorcycleYear;
    }

    public void setMotorcycleYear(String motorcycleYear) {
        this.motorcycleYear = motorcycleYear;
    }

    public String getMotorcycleColour() {
        return motorcycleColour;
    }

    public void setMotorcycleColour(String motorcycleColour) {
        this.motorcycleColour = motorcycleColour;
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

   // public Motorcycle getMotorcycle() {
   //     return motorcycle;
  //  }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Override
    public String toString() {
        return "MotorcycleParameters{" +
                "parametersId=" + parametersId +
                ", motorcycleYear='" + motorcycleYear + '\'' +
                ", motorcycleColour='" + motorcycleColour + '\'' +
                ", mileage='" + mileage + '\'' +
                ", transmission='" + transmission + '\'' +
              //  ", motorcycle=" + motorcycle +
                '}';
    }
}
