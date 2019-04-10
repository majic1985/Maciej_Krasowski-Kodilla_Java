package com.kodilla.exception.com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Set;

public final class FindFlightMockUp {
    public FindFlightMockUp() {
    }

    public static boolean checkIfExistsOnMap( Set<String> airportSet, String comparedAirport) {
        boolean isOnMap = airportSet.stream().anyMatch((n) -> {
            return n.equals(comparedAirport);
        });
        System.out.println(comparedAirport + " <<-- exists on the map: " + isOnMap);
        return isOnMap;
    }

    public final void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> availability = new HashMap();
        availability.put("LHR", true);
        availability.put("WAW", true);
        availability.put("KRK", false);
        availability.put("JFK", true);
        availability.put("LAX", true);
        availability.put("SYD", true);
        if (checkIfExistsOnMap(availability.keySet(), flight.arrivalAirport) && checkIfExistsOnMap(availability.keySet(), flight.departureAirport)) {
            System.out.println("System continues to work...");
        } else {
            throw new RouteNotFoundException("no airport on the map");
        }
    }
}

