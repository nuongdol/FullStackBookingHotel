package com.example.BookingHotel.repository;

import com.example.BookingHotel.model.BookedRoom;
import com.example.BookingHotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {
    List<BookedRoom> findByRoomId(Long roomId);

    Optional<BookedRoom>findByBookingConfirmationCode(String confirmationCode);
}
