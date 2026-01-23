package com.example.Docker.user_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "booking-service", url = "http://booking-service")
public interface BookingServiceClient {
    @PostMapping("/booking")
    public String createBooking();
}
