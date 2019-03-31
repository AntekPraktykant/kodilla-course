package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;
import com.kodilla.good.patterns.flights.Airport;
import com.kodilla.good.patterns.flights.AirportsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GoodPatternsMain {

    public static void main(String[] args) {

        MovieStore ms = new MovieStore();

        System.out.println(ms.streamTheMapOfTitles());

        AirportsList al = new AirportsList();

        System.out.println(al.getAllAirportsAccesibleFrom("Wrocław"));
        System.out.println(al.getAllAirportsWithFlightsTo("Malta"));
    }
}
