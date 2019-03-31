package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AirportsList {
    public static ArrayList<Airport> airports = new ArrayList<>();

    public AirportsList() {
        String[] flights = {"Kraków", "Katowice", "Warszawa"};
        String[] flights2 = {"Malta", "Frankfurt", "Tokyo"};
        String[] flights3 = {"Londyn", "Madryt", "Berlin"};
        ArrayList<String> flightsToWroclaw = new ArrayList<>(Arrays.asList(flights));
        ArrayList<String> flightsFromWroclaw = new ArrayList<>(Arrays.asList(flights2));
        ArrayList<String> flightsToKatowice = new ArrayList<>(Arrays.asList(flights2));
        ArrayList<String> flightsFromKatowice = new ArrayList<>(Arrays.asList(flights3));
        ArrayList<String> flightsToWarszawa = new ArrayList<>(Arrays.asList(flights3));
        ArrayList<String> flightsFromWarszawa = new ArrayList<>(Arrays.asList(flights2));

        Airport wroclaw = new Airport("Wrocław", flightsToWroclaw, flightsFromWroclaw);
        Airport katowice = new Airport("Katowice", flightsToKatowice, flightsFromKatowice);
        Airport warszawa = new Airport("Warszawa", flightsToWarszawa, flightsFromWarszawa);


        airports.add(wroclaw);
        airports.add(warszawa);
        airports.add(katowice);
    }
    public List<String> getAllAirportsAccesibleFrom(String name) {
        return airports.stream()
                .filter(airport -> airport.getName() == name)
                .flatMap(airport -> airport.getFlightsFrom().stream())
                .collect(Collectors.toList());
    }
    public List<String> getAllAirportsWithFlightsTo(String name) {
        return airports.stream()
                .filter(airport -> airport.getFlightsFrom().contains(name))
                .map(Airport::getName)
                .collect(Collectors.toList());
    }
    public List<String> getAllAirportsAccesibleFromAirportWithMiddleLandingAt(String from, String middle) {
        return airports.stream()
                .filter(airport -> airport.getName() == from)
                .filter(airport -> airport.getFlightsTo().contains(middle))
                .map(Airport::getName)
                .collect(Collectors.toList());
    }
}
