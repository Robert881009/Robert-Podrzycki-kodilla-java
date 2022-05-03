package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    private final String continent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String continent) {
        this.continent = continent;

    }
    public void addCountry(Country country){
        countryList.add(country);
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public String getContinent() {
        return continent;
    }

}
