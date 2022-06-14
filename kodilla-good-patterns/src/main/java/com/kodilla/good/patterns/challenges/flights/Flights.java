package com.kodilla.good.patterns.challenges.flights;


import java.util.ArrayList;

import java.util.List;


public class Flights {

    public List<Flight> flights(){
        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight(new Departures("Poznań"),new Arrival("Kraków"),new Through("Brak")));
        flightsList.add(new Flight(new Departures("Kraków"),new Arrival("Gdańsk"),new Through("Warszawa")));
        flightsList.add(new Flight(new Departures("Gdańsk"), new Arrival("Wrocław"),new Through("Poznań")));
        flightsList.add(new Flight(new Departures("Warszawa"), new Arrival("Wrocław"),new Through("Brak")));
        flightsList.add(new Flight(new Departures("Gdańsk"),new Arrival("Kraków"), new Through("Warszawa")));
        flightsList.add(new Flight(new Departures("Kraków"), new Arrival("Poznań"),new Through("Brak")));

        return flightsList;
    }

}
