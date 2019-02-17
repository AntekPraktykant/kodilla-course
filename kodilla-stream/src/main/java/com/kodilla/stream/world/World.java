package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    public final List<Continent> listOfContinents = new ArrayList<>();

    public World(List<Continent> continents) {
        this.listOfContinents.addAll(continents);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation = listOfContinents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopulation;
    }
}
