package com.project.motorcycleRental.model;

import javax.persistence.*;

@Entity
@Table(name = "userroles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userRoleId")
    private int userRoleId;

    @Column(name = "userRoleType")
    private String userRoleType;

    public UserRole() {
    }

    public UserRole(int userRoleId, String userRoleType) {
        this.userRoleId = userRoleId;
        this.userRoleType = userRoleType;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRoleType() {
        return userRoleType;
    }

    public void setUserRoleType(String userRoleType) {
        this.userRoleType = userRoleType;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userRoleId=" + userRoleId +
                ", userRoleType='" + userRoleType + '\'' +
                '}';
    }
}
