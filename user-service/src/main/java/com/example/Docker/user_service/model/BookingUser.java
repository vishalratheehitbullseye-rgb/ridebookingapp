package com.example.Docker.user_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class BookingUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingUserId;
    private String bookingUserName;
    private Integer age;
    private String email;
}
