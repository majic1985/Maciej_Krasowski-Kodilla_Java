package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearchProcessor {

    public List<Flight> departureAirportSearch( ArrayList<Flight> currentFlightsList, String selectedAirport) {
        return (List)currentFlightsList.stream().filter((n) -> {
            return n.getDepartureAirport().equals(selectedAirport);
        }).collect(Collectors.toList());
    }

    public List<Flight> arrivalAirportSearch(ArrayList<Flight> currentFlightList, String selectedAirport) {
        return (List)currentFlightList.stream().filter((n) -> {
            return n.getArrivalAirport().equals(selectedAirport);
        }).collect(Collectors.toList());
    }

    public List<Flight> getDeparturesAfterLocalTime(ArrayList<Flight> currentFlightList, String selectedAirport, LocalTime arrivalTime) {
        return (List)this.departureAirportSearch(currentFlightList, selectedAirport).stream().filter((n) -> {
            return n.getDepartureTime().isAfter(arrivalTime);
        }).collect(Collectors.toList());
    }

    public List<Flight> directFlightSearch(ArrayList<Flight> currentFlightList, String departureAirport, String arrivalAirport) {
        List<Flight> flightsFromDestination = this.departureAirportSearch(currentFlightList, departureAirport);
        return (List)flightsFromDestination.stream().filter((n) -> {
            return n.getArrivalAirport().equals(arrivalAirport);
        }).collect(Collectors.toList());
    }

    public HashMap<Flight, Flight> connectionFlightSearch( ArrayList<Flight> currentFlightList, String departureAirport, String arrivalAirport) {
        List<Flight> flightsFromDestination = this.departureAirportSearch(currentFlightList, departureAirport);
        HashMap<Flight, Flight> connectedFlights = new HashMap();

        for(int i1 = 0; i1 < flightsFromDestination.size(); ++i1) {
            List<Flight> connectionOption = this.getDeparturesAfterLocalTime(currentFlightList, ((Flight)flightsFromDestination.get(i1)).getArrivalAirport(), ((Flight)flightsFromDestination.get(i1)).getArrivalTime());

            for(int i2 = 0; i2 < connectionOption.size(); ++i2) {
                if (((Flight)connectionOption.get(i2)).getArrivalAirport().equals(arrivalAirport)) {
                    connectedFlights.put(flightsFromDestination.get(i1), connectionOption.get(i2));
                }
            }
        }

        return connectedFlights;
    }
}
