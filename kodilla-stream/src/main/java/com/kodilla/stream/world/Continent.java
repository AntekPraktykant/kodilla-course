package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> listOfCountries = new ArrayList<>();
    private final String name;

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.listOfCountries.addAll(countries);
    }

    public List<Country> getCountries() {
        return this.listOfCountries;
    }
}
