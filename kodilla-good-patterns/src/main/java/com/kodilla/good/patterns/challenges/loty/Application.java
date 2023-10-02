package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        ArrayList<Flight> flightList = flightDatabase.createFlightList();
        CheckFlight checkFlight = new CheckFlight();
        List<Flight> streamedListDepartures = checkFlight.checkDeparturesFlight(flightList, "Katowice");
        System.out.println("\nLOTY Z KATOWIC");
        streamedListDepartures.stream()
                .map(l->l.getFlightDeparture() + " -> " + l.getFlightArrival())
                .forEach(System.out::println);
        System.out.println("\nLOTY DO GDANSKA");
        List<Flight> streamedListArrivals = checkFlight.checkArrivalFlights(flightList, "Warszawa");
        streamedListArrivals.stream()
                .map(l->l.getFlightDeparture() + " -> " + l.getFlightArrival())
                .forEach(System.out::println);
        System.out.println("\nLOTY Z PRZESIADKA");
        List<Flight> connectingFlightsList = checkFlight.checkConnectingFlight(flightList, "Katowice", "Poznan");
        connectingFlightsList.stream()
                .map(l->l.getFlightDeparture() + " -> " + l.getFlightArrival())
                .forEach(System.out::println);
    }
}
