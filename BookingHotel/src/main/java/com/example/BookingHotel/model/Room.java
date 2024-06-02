package com.example.BookingHotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
@Entity
@Setter
@Getter
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked = false;
    @Lob
    private Blob photo;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BookedRoom> bookings;
    public Room() {
        this.bookings = new ArrayList<>();
        //khoi tao danh sach dat phong
    }
    public void addBooking(BookedRoom booking){
        if(bookings == null){
            bookings = new ArrayList<>();
        }
        bookings.add(booking);//arrayList có hàm add
        booking.setRoom(this);//this o day la ban than class room
        isBooked = true;
        String bookingCode = RandomStringUtils.randomNumeric(10);//bookingCode --> guests booked room
        booking.setBookingConfirmationCode(bookingCode);//khoi tao lai gia tri bookingCode sau khi nhan gia tri moi
    }
}
