package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        List<Country> europa = new ArrayList<>();
        List<Country> asia = new ArrayList<>();

        europa.add(new Country("Poland", new BigDecimal("350000000")));
        europa.add(new Country("Spain", new BigDecimal("450000000")));
        world.addContinent(new Continent("Europe", europa));

        asia.add(new Country("China",new BigDecimal("1300000000")));
        asia.add(new Country("India", new BigDecimal("1200000000")));
        world.addContinent(new Continent("Asia", asia));
        //When
        BigDecimal PeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal("3300000000");
        //Then

        Assertions.assertEquals(expectedQuantity, PeopleQuantity);
    }
}
