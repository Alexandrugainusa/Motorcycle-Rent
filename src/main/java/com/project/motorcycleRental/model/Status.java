package com.project.motorcycleRental.model;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statusId")
    private int statusId;


    @Column(name = "statusIdentifier")
    private String motoStatus;

    @Column(name = "statusName")
    private String statusname;

    public Status() {
        super();
    }

    public Status(int statusId, String motoStatus, String statusname) {
        this.statusId = statusId;
        this.motoStatus = motoStatus;
        this.statusname = statusname;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getMotoStatus() {
        return motoStatus;
    }

    public void setMotoStatus(String motoStatus) {
        this.motoStatus = motoStatus;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusId='" + statusId + '\'' +
                "motoStatus='" + motoStatus + '\'' +
                ", statusname='" + statusname + '\'' +
                '}';
    }
}
