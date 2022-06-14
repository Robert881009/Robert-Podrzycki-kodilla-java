package com.kodilla.good.patterns.challenges.flights;


import java.util.List;

public class FromCity{
    Flights flights = new Flights();

    public void FromCity(Departures departures) {
        List<Flight> flightList = flights.flights();
        flightList.stream()
                .filter(e -> e.getDepartures().getDepartures().equals(departures.getDepartures()))
                .forEach(System.out::println);



    }
}
