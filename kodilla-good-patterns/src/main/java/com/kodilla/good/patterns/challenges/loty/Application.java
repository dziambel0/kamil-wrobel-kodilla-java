package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        String from = "Katowice";
        String to = "Warszawa";

        FlightDatabase flightDatabase = new FlightDatabase();
        ArrayList<Flight> flightList = flightDatabase.createFlightList();
        CheckFlight checkFlight = new CheckFlight();
        List<Flight> streamedListDepartures = checkFlight.checkDeparturesFlight(flightList, from);
        System.out.println("\nLOTY Z " + from);
        streamedListDepartures.stream()
                .map(l->l.getFlightDeparture() + " -> " + l.getFlightArrival())
                .forEach(System.out::println);
        System.out.println("\nLOTY DO " + to);
        List<Flight> streamedListArrivals = checkFlight.checkArrivalFlights(flightList, to);
        streamedListArrivals.stream()
                .map(l->l.getFlightDeparture() + " -> " + l.getFlightArrival())
                .forEach(System.out::println);
        System.out.println("\nLOTY Z PRZESIADKA");
        List<Flight> connectingFlightsList = checkFlight.checkConnectingFlight(flightList, from, to);
        connectingFlightsList.stream()
                .map(l->l.getFlightDeparture() + " -> " + l.getFlightArrival())
                .forEach(System.out::println);
    }
}
