package com.kodilla.good.patterns.challenges.flights;

public class Departures {
    private String departures;

    public Departures(String departures) {
        this.departures = departures;
    }

    public String getDepartures() {
        return departures;
    }

    @Override
    public String toString() {
        return "Departures{" +
                "departures='" + departures + '\'' +
                '}';
    }
}
