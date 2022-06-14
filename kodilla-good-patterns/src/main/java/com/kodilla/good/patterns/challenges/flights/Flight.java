package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    private Departures departures;
    private Arrival arrival;
    private Through through;


    public Flight(Departures departures, Arrival arrival, Through through) {
        this.departures = departures;
        this.arrival = arrival;
        this.through = through;
    }


    public Departures getDepartures() {
        return departures;
    }

    public Arrival getArrival() {
        return arrival;
    }

    public Through getThrough() {
        return through;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departures=" + departures +
                ", arrival=" + arrival +
                ", through=" + through +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departures, flight.departures) && Objects.equals(arrival, flight.arrival) && Objects.equals(through, flight.through);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departures, arrival, through);
    }
}
