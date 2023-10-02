package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;

public class FlightDatabase {
    public ArrayList<Flight> createFlightList(){
        ArrayList<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Katowice", "Gdansk"));
        flightList.add(new Flight("Krakow", "Warszawa"));
        flightList.add(new Flight("Poznan", "Wroclaw"));
        flightList.add(new Flight("Katowice", "Krakow"));
        flightList.add(new Flight("Krakow", "Poznan"));
        flightList.add(new Flight("Warszawa", "Katowice"));
        flightList.add(new Flight("Wroclaw", "Poznan"));
        flightList.add(new Flight("Gdansk", "Krakow"));
        flightList.add(new Flight("Warszawa", "Poznan"));
        flightList.add(new Flight("Wroclaw", "Gdansk"));
        return flightList;
    }
}
