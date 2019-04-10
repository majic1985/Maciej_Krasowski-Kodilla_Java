package com.kodilla.exception.main;

import com.kodilla.exception.com.kodilla.exception.test.FindFlightMockUp;
import com.kodilla.exception.com.kodilla.exception.test.Flight;
import com.kodilla.exception.com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {
    public ExceptionModuleRunner() {
    }
    public static void main(String[] args) {
        FindFlightMockUp flightStatus = new FindFlightMockUp();
        Flight londonToNewYork = new Flight("LHR", "JFK");
        Flight notExistingToAny = new Flight("XXX", "LHR");

        try {
            flightStatus.findFlight(londonToNewYork);
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect arrival or departure airport");
        }

        try {
            flightStatus.findFlight(notExistingToAny);
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect arrival or departure airport");
        }

    }
}
