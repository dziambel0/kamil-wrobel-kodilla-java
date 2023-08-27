package com.kodilla.exception.test;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight("Katowice", "Wroclaw");
        FlightFinder flightFinder = new FlightFinder();
        //flightFinder.findFilght(flight);

        try {
            flightFinder.findFilght(flight);
        }catch (RouteNotFoundException e){
            System.out.println("Lotnisko nie istnieje");
        }finally {
            System.out.println("Mapa zostala sprawdzona");
        }

    }

}
