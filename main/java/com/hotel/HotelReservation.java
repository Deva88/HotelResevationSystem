package com.hotel;
import java.util.ArrayList;
import java.util.List;

/*
@Description:-Add Hotel in a Hotel Reservation System
 */
public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

    public boolean addHotel(String name, int rates) {
        Hotel hotel = new Hotel(name, rates);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }
}