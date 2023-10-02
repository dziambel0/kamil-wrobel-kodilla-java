package com.kodilla.good.patterns.challenges.loty;

import java.util.Objects;

public class Flight {
    private String flightDeparture;
    private String flightArrival;

    public Flight(String flightDeparture, String flightArrival) {
        this.flightDeparture = flightDeparture;
        this.flightArrival = flightArrival;
    }

    public String getFlightDeparture() {
        return flightDeparture;
    }

    public String getFlightArrival() {
        return flightArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightDeparture, flight.flightDeparture) && Objects.equals(flightArrival, flight.flightArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightDeparture, flightArrival);
    }
}
