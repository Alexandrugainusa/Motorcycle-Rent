package com.project.motorcycleRental.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    private int bookingId;

    @Column(name = "bookingUserId")
    private int bookingUserId;

    @Column(name = "bookingMotorcycleId")
    private int bookingMotorcycleId;

    @Column(name = "locationId")
    private int locationId;

    @Column(name = "receiptDate")
    private LocalDateTime receiptDate;

    @Column(name = "returnDate")
    private LocalDateTime returnDate;

    @Column(name = "bookingStatus")
    private String bookingStatus;

    @Column(name = "totalAmount")
    private double totalAmount;

    public Booking() {
    }

    public Booking(int bookingUserId, int bookingMotorcycleId, int locationId, LocalDateTime receiptDate, LocalDateTime returnDate, String bookingStatus, double totalAmount) {
        this.bookingUserId = bookingUserId;
        this.bookingMotorcycleId = bookingMotorcycleId;
        this.locationId = locationId;
        this.receiptDate = receiptDate;
        this.returnDate = returnDate;
        this.bookingStatus = bookingStatus;
        this.totalAmount = totalAmount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getBookingUserId() {
        return bookingUserId;
    }

    public void setBookingUserId(int bookingUserId) {
        this.bookingUserId = bookingUserId;
    }

    public int getBookingMotorcycleId() {
        return bookingMotorcycleId;
    }

    public void setBookingMotorcycleId(int bookingMotorcycleId) {
        this.bookingMotorcycleId = bookingMotorcycleId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public LocalDateTime getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDateTime receiptDate) {
        this.receiptDate = receiptDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingUserId=" + bookingUserId +
                ", bookingMotorcycleId=" + bookingMotorcycleId +
                ", locationId=" + locationId +
                ", receiptDate=" + receiptDate +
                ", returnDate=" + returnDate +
                ", bookingStatus='" + bookingStatus + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
