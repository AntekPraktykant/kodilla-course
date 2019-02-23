package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestModuleRunner {

    public static void main (String[] args) {
        Random r = new Random();
        ArrayList<Flight> flights = new ArrayList<>();
        ArrayList<String> airports = new ArrayList<>(Arrays.asList(FlightSearcher.getAirports()));
        String[] fakeAirports = {"AAA", "BBB", "CCC"};
        airports.addAll(Arrays.asList(fakeAirports));

        for (int i = 0; i < 20; i++) {
            String aiport1 = airports.get(r.nextInt(airports.size() - 1));
            String aiport2 = airports.get(r.nextInt(airports.size() - 1));
            if (aiport1 == aiport2) {
                i--;
                continue;
            }
            flights .add(new Flight(aiport1, aiport2));
        }

        for (Flight flight: flights) {
            try {
                System.out.println((FlightSearcher.findFlight(flight)));
            } catch (RouteNotFoundException e) {
                System.out.println("Nie znaleziono lotniska " + e);
            }
        }
    }
}
