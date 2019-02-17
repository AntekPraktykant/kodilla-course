package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Random;

public class Country {
    private final BigDecimal population;
    private final String name;

    public Country(String name, BigDecimal population) {
        this.population = population;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }
}
