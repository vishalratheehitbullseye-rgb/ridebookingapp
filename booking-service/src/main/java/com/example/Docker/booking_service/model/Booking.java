package com.example.Docker.booking_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private String bookingUserName;
    private String riderUserName;
    private String startingPoint;
    private String destination;

    public Booking(String bookingUserName, String riderUserName, String startingPoint, String destination) {
        this.bookingUserName = bookingUserName;
        this.riderUserName = riderUserName;
        this.startingPoint = startingPoint;
        this.destination = destination;
    }
}
