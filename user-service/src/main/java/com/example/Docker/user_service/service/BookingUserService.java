package com.example.Docker.user_service.service;

import com.example.Docker.user_service.model.BookingUser;
import com.example.Docker.user_service.repo.BookingUserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingUserService {

    private final BookingUserRepo bookingUserRepo;

    public BookingUser createBookingUser(BookingUser bookingUser) {
        return bookingUserRepo.save(bookingUser);
    }
}
