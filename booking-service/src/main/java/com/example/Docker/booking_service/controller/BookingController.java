package com.example.Docker.booking_service.controller;

import com.example.Docker.booking_service.model.Booking;
import com.example.Docker.booking_service.service.BookingService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping()
    public ResponseEntity<?> createBooking(
            @RequestBody Booking booking,
            HttpServletRequest request
    ){
        System.out.println("User : " + booking.getBookingUserName() +
                " has created a booking with rider : " + booking.getRiderUserName()+
                " from starting point : " + booking.getStartingPoint()+
                " to destination : " + booking.getDestination());

        return ResponseEntity.ok(bookingService.createBooking(booking));
    }

    @PostMapping("/book")
    public String createNewBooking(){
        System.out.println("Create booking called from user service, Inside Booking Service");
        return "Create booking called from user service, Inside Booking Service";
    }



}
