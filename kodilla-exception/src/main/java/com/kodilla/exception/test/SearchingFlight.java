package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;



public class SearchingFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> listAirports = new HashMap<>();
        {
            listAirports.put("Berlin", true);
            listAirports.put("London", true);
            listAirports.put("Madrid", true);
            listAirports.put("Warsaw", true);

        }
        for (Map.Entry<String, Boolean> flights : listAirports.entrySet()) {
            if (flights.getKey().equals(flight.getArrivalAirport()) && flights.getValue()) {
                System.out.println(flights.getValue());
            }
            if (listAirports.containsKey(flight.getArrivalAirport())) {

            }else {
                throw new RouteNotFoundException();
            }
        }
    }

    public static void main(String[] args) {
        SearchingFlight flight = new SearchingFlight();
        try {
            flight.findFlight(new Flight("Berlin", "Moscow"));
        }catch (RouteNotFoundException e){
            System.out.println(new RouteNotFoundException().getMessage());
        }
    }
}

