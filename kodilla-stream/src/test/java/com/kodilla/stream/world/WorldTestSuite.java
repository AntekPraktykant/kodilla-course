package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        ArrayList<Country> europa = new ArrayList<>();
        ArrayList<Country> africa = new ArrayList<>();
        ArrayList<Country> asia = new ArrayList<>();
        europa.add(new Country("Poland", new BigDecimal("10000000")));
        europa.add(new Country("Germany", new BigDecimal("10000000")));
        europa.add(new Country("Malta", new BigDecimal("50000000")));
        africa.add(new Country("Egypt", new BigDecimal("90000000")));
        africa.add(new Country("Kongo", new BigDecimal("10000000")));
        africa.add(new Country("RPA", new BigDecimal("10000000")));
        asia.add(new Country("Japan", new BigDecimal("10000000")));

        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(new Continent("europa", europa));
        continents.add(new Continent("asia", asia));
        continents.add(new Continent("africa", africa));

        World world = new World(continents);
        BigDecimal totalPop = new BigDecimal("190000000");
        Assert.assertEquals(totalPop, world.getPeopleQuantity());
    }
}
