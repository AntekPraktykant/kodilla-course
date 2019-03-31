package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {

    private String name;
    private List<String> flightsTo = new ArrayList<>();
    private List<String> flightsFrom = new ArrayList<>();

    public Airport(String name, List<String> flightsTo, List<String> flightsFrom) {
        this.name = name;
        this.flightsTo = flightsTo;
        this.flightsFrom = flightsFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public List<String> getFlightsTo() {
        return this.flightsTo;
    }
    public List<String> getFlightsFrom() {
        return this.flightsFrom;
    }

    public String getName() {
        return name;
    }
}
