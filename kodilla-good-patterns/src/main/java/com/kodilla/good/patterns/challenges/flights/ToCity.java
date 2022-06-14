package com.kodilla.good.patterns.challenges.flights;


import java.util.List;

public class ToCity {
    Flights flights = new Flights();

    public void ToCity(Arrival arrival){
        List<Flight> flightList = flights.flights();
        flightList.stream()
                .filter(e-> e.getArrival().getArrival().equals(arrival.getArrival()))
                .forEach(System.out::println);


    }
}
