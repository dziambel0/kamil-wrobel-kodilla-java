package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckFlight {
    public List<Flight> checkDeparturesFlight (ArrayList<Flight> flightList, String from){
        List<Flight> streamedList = flightList.stream()
                .filter(l->l.getFlightDeparture().equals(from))
                .collect(Collectors.toList());
        return streamedList;
    }
    public List<Flight> checkArrivalFlights (ArrayList<Flight> flightList, String to){
        List<Flight> streamedList = flightList.stream()
                .filter(l->l.getFlightArrival().equals(to))
                .collect(Collectors.toList());
        return streamedList;
    }

    public List<Flight> checkConnectingFlight (ArrayList<Flight> flightList, String from, String to){
        List<Flight> streamedListDepartures = checkDeparturesFlight(flightList, from);
        List<Flight> streamedListArrivals = checkArrivalFlights(flightList, to);
        List<Flight> resultList = new ArrayList<>();
        for(Flight first : streamedListDepartures){
            for (Flight second : streamedListArrivals){
                if(first.getFlightArrival().equals(second.getFlightDeparture())) {
                    resultList.add(first);
                    resultList.add(second);
                }
            }
        }
        return resultList;
    }
}
