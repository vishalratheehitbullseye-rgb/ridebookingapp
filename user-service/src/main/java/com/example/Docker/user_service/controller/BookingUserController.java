package com.example.Docker.user_service.controller;

import com.example.Docker.user_service.model.BookingUser;
import com.example.Docker.user_service.service.BookingUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/booking-user")
@RequiredArgsConstructor
public class BookingUserController {

    private final BookingUserService bookingUserService;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping()
    public ResponseEntity<BookingUser> createBookingUser(@RequestBody BookingUser bookingUser){
        System.out.println(bookingUser);
        BookingUser savedBookingUser = bookingUserService.createBookingUser(bookingUser);
        return ResponseEntity.ok(savedBookingUser);
    }

//    @PostMapping("/book")
//    public ResponseEntity<?> createBooking(){
//        System.out.println("Call the Booking service from UserService");
//        String bookingServiceUrl = "http://localhost:8081/booking/book";
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Content-Type", "application/json");
//
//        // Create HTTP entity with headers (if necessary)
//        HttpEntity<String> entity = new HttpEntity<>(null, headers);
//
//        // Call the Booking microservice's createBooking method
//        ResponseEntity<String> response = restTemplate.exchange(
//                bookingServiceUrl, HttpMethod.POST, entity, String.class);
//
//        // Return the response from the Booking microservice
//        return ResponseEntity.ok(response.getBody());
//    }



}
