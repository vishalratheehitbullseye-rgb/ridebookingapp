package com.example.Docker.user_service.repo;

import com.example.Docker.user_service.model.BookingUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingUserRepo extends JpaRepository<BookingUser, Long> {

}
