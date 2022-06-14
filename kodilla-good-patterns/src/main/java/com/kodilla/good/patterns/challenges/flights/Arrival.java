package com.kodilla.good.patterns.challenges.flights;

public class Arrival {
    private String arrival;

    public Arrival(String arrival) {
        this.arrival = arrival;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Arrival{" +
                "arrival='" + arrival + '\'' +
                '}';
    }
}
