package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;
import com.kodilla.good.patterns.flights.Airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GoodPatternsMain {
    public static void main(String[] args) {
        MovieStore ms = new MovieStore();

        System.out.println(ms.streamTheMapOfTitles());

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
        Airport katowice = new Airport("Katowice", flightsToWroclaw, flightsFromWroclaw);
        Airport warszawa = new Airport("Warszawa", flightsToWroclaw, flightsFromWroclaw);
    }
}
