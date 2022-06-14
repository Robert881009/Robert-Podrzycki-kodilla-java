package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Optional;

public class ThroughCity {
    Flights flights = new Flights();

    public void ThroughCity(Through through){
        List<Flight> flightList = flights.flights();
        flightList.stream()
                .filter(e-> e.getThrough().getThrough().equals(through.getThrough()))
                .forEach(System.out::println);
    }
}
