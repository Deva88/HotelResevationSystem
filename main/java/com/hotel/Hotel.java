package com.hotel;
/*
 *@Description:-Add Hotel in a Hotel Reservation System
 *Find the cheapest Hotel for a given Date Range
 *add weekday and weekend rates for each Hotel - For Lakewood Weekday
 */
public class Hotel {

    //variables
    private final String name;
    private final Double rates;
    private final Double weekendRates;

    //constructor
    public Hotel(String name, Double rates) {
        this.name = name;
        this.rates = rates;
        weekendRates = null;
    }

    public Hotel (String name, Double rates, Double weekendRates){
        this.name = name;
        this.rates = rates;
        this.weekendRates = weekendRates;
    }

    //to get attributes
    public String getName() {
        return name;
    }

    public Double getRates() {
        return rates;
    }

    public Double getWeekendRates() {
        return weekendRates;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name='" + name + '\'' + ", rates=" + rates + ", weekendRates=" + weekendRates + '}';
    }

}