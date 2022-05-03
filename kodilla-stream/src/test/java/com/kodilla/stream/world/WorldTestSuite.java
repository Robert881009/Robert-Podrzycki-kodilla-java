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
       //Country
        Country country1 = new Country("Poland", new BigDecimal("350000000"));
        Country country2 = new Country("Spain", new BigDecimal("450000000"));
        Country country3 = new Country("China", new BigDecimal("1300000000"));
        Country country4 = new Country("India", new BigDecimal("1200000000"));

       //Continents
        Continent europa = new Continent("Europa");
        europa.addCountry(country1);
        europa.addCountry(country2);
        Continent asia = new Continent("Asia");
        asia.addCountry(country3);
        asia.addCountry(country4);

        //World
        World world = new World();
        world.addContinent(europa);
        world.addContinent(asia);


        //When
        BigDecimal PeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal("3300000000");
        //Then

        Assertions.assertEquals(expectedQuantity, PeopleQuantity);
    }
}
