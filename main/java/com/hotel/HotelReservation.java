package com.hotel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*
 *@Description:-Add Hotel in a Hotel Reservation System
 *Find the cheapest Hotel for a given Date Range
 *add weekday and weekend rates for each Hotel.
 */
public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

    //taken addHotel() method
    public boolean addHotel(String name, Double rates) {
        Hotel hotel = new Hotel(name, rates);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }

    //taken findCheapestHotel() method
    public String findCheapestHotel(Date[] dates) {
        ArrayList<Double> cheapRateHotels = new ArrayList<>();
        for (Hotel hotel : hotelList){
            Double rate = 0.0;
            for ( Date date : dates){
                rate = hotel.getRates();
            }
            cheapRateHotels.add(rate);
        }
        Double cheap = cheapRateHotels.stream().min(Comparator.comparing(Double::doubleValue)).orElse(null);
        int index = cheapRateHotels.indexOf(cheap);
        return hotelList.get(index).getName();
    }

    //taken addHotelRates() method
    public boolean addHotelRates(String name, double weekday, double weekend ) {
        Hotel hotel = new Hotel(name, weekday, weekend);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }
}