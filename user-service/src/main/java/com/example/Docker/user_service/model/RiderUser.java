package com.example.Docker.user_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RiderUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long riderUserId;
    private String riderUserName;
    private Integer age;
    private String email;

}
