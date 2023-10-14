package com.kodilla.patterns.enums.hotel;

public class HotelApp {
    public static void main(String[] args) {
        System.out.println("Accomodation Prices:");
        System.out.println("1 Single Bed:");
        System.out.println("Low season - " + Seasons.LOW.getSingleBedPrice());
        System.out.println("High season - " + Seasons.HIGH.getSingleBedPrice());
        System.out.println("Holiday season - " + Seasons.HOLIDAY.getSingleBedPrice());
        System.out.println("2 Double Bed:");
        System.out.println("Low season - " + Seasons.LOW.getDoubleBedPrice());
        System.out.println("High season - " + Seasons.HIGH.getDoubleBedPrice());
        System.out.println("Holiday season - " + Seasons.HOLIDAY.getDoubleBedPrice());

        Seasons seasons = Seasons.HOLIDAY;
        System.out.println(seasons);
    }
}
