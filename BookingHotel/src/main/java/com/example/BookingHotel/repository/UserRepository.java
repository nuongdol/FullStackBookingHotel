package com.example.BookingHotel.repository;

import com.example.BookingHotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//public interface UserRepository extends JpaRepository<User,Long> {
//
//    boolean existsByEmail(String email);
//
//    void deleteByEmail(String email);
//
//   Optional <User> findByEmail(String email);
//}




public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

    Optional<User> findByEmail(String email);
}