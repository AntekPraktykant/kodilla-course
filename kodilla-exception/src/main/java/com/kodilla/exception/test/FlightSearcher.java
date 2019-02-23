package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlightSearcher {

    private static String [] airports = {"KTW", "MTA", "KRK", "WAW", "TKO", "NYA"};

    public static String findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();
        Map<String, Boolean> airportsMap = new HashMap<>();
        Random r = new Random();

        for (String airport:airports) {
            airportsMap.put(airport, r.nextBoolean());
        }

        if(airportsMap.containsKey(arrivalAirport)) {
            return airportsMap.get(arrivalAirport)? "Flight from: " + departureAirport + " to: " + arrivalAirport : "This airport is not reachable";
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static String[] getAirports() {
        return airports;
    }
}
