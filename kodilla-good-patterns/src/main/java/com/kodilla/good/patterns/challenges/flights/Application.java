package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FromCity fromCity = new FromCity();
        ToCity toCity = new ToCity();
        ThroughCity throughCity = new ThroughCity();
        fromCity.FromCity(new Departures("Gdańsk"));
        toCity.ToCity(new Arrival("Kraków"));
        throughCity.ThroughCity(new Through("Warszawa"));

    }
}