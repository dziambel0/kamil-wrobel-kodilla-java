package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException{

        int lotrnikoIstnieje = 0;

        Map<String, Boolean> mapaLotow = new HashMap<>();
        mapaLotow.put("Katowice", true);
        mapaLotow.put("Warszawa", true);
        mapaLotow.put("Wroclaw", false);
        mapaLotow.put("Poznan", false);

        for (Map.Entry<String, Boolean> entry : mapaLotow.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())){
                lotrnikoIstnieje = 1;
            }
        }
        if (lotrnikoIstnieje == 1){
            System.out.println("Lotnisko istnieje");
        }else {
            throw new RouteNotFoundException ();
        }
    }
}
