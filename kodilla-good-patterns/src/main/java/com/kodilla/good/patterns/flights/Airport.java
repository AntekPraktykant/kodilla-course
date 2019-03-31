package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String name;
    private List<String> flightsTo = new ArrayList<>();
    private List<String> flightsFrom = new ArrayList<>();

    public Airport(String name, List<String> flightsTo, List<String> flightsFrom) {
        this.name = name;
        this.flightsTo = flightsTo;
        this.flightsFrom = flightsFrom;
    }

    public List<String> getFlightsTo() {
        return this.flightsTo;
    }
    public List<String> getFlightsFrom() {
        return this.flightsFrom;
    }
}
