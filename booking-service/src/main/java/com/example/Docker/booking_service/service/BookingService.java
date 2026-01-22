package com.example.Docker.booking_service.service;

import com.example.Docker.booking_service.model.Booking;
import com.example.Docker.booking_service.repo.BookingRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepo bookingRepo;

    public Booking createBooking(Booking booking){
        return bookingRepo.save(booking);
    }

}
