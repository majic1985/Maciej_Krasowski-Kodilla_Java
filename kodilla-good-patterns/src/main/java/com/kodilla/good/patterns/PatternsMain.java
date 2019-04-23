package com.kodilla.good.patterns;

import com.kodilla.good.patterns.flights.Flight;
import com.kodilla.good.patterns.flights.FlightsRepoRetriever;
import com.kodilla.good.patterns.flights.FlightsSearchProcessor;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class PatternsMain {
    public static void main( String[] args ) {
/*13.1
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> newList = movieStore.getMovies();

        String movieTitles = newList.entrySet().stream()
                .map(n -> n.getValue())
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!", "Movie titles from the store: ", ""));

       System.out.println(movieTitles);

    13.2
          System.out.println("Moduł 13.2");
          OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
          OrderRequest orderRequest = orderRequestRetriever.retrieve();
          ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailNotification(), new OrderKapcie(), new KapcieOrderRepository());
          productOrderProcessor.process(orderRequest);
          13.4 "Food2Door"

        ProductListRetriever productListRetriever = new ProductListRetriever();
        ProductList productList = productListRetriever.retrieve();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ShoppingBasket userBasket = orderRequestRetriever.retrieve(productList.getProductList());

        Food2DoorProcessor extraFoodShopOrders = new Food2DoorProcessor(new ExtraFoodShop());
        extraFoodShopOrders.process(userBasket);

        Food2DoorProcessor healthyShopOrders = new Food2DoorProcessor(new HealthyShop());
        healthyShopOrders.process(userBasket);

        Food2DoorProcessor glutenFreeShopOrders = new Food2DoorProcessor(new GlutenFreeShop());
        glutenFreeShopOrders.process(userBasket);*/

        System.out.println("Zadanie 13.5");
        FlightsRepoRetriever currentFlightsList = new FlightsRepoRetriever();

        FlightsSearchProcessor flightSearch = new FlightsSearchProcessor();

        String selectedAirport = "WAW";
        System.out.println("\nList of flights departing from: " + selectedAirport);

        flightSearch.departureAirportSearch(currentFlightsList.retrieve(), selectedAirport).stream()
                .map(n -> n.getDepartureTime() + " " + n.getFlightNumber() + " to " + n.getArrivalAirport())
                .sorted()
                .forEach(System.out::println);


        // finding flights arriving to selected airport

        selectedAirport = "WRO";
        System.out.println("\nList of flights arriving to: " + selectedAirport);

        flightSearch.arrivalAirportSearch(currentFlightsList.retrieve(), selectedAirport).stream()
                .map(n -> n.getArrivalTime() + " " + n.getFlightNumber() + " from " + n.getDepartureAirport())
                .sorted()
                .forEach(System.out::println);

        // finding direct flights between selected airports

        String selectedDepartingAirport = "GDN";
        String selectedArrivalAirport = "WRO";

        List<Flight> directFlights = flightSearch.directFlightSearch(currentFlightsList.retrieve(), selectedDepartingAirport, selectedArrivalAirport);

        System.out.println("\n" + directFlights.size() + " direct flights found on route [ " + selectedDepartingAirport + " -> " + selectedArrivalAirport + " ]");
        directFlights.stream()
                .map(n -> n.getDepartureTime()
                        + " "
                        + n.getFlightNumber()
                        + ", total flight time "
                        + Duration.between(n.getArrivalTime(), n.getDepartureTime()).toString().substring(3)
                        + ", arriving "
                        + n.getArrivalTime())
                .sorted()
                .forEach(System.out::println);

        // connected flights between selected airports

        selectedDepartingAirport = "GDN";
        selectedArrivalAirport = "WRO";

        HashMap<Flight, Flight> connections = flightSearch.connectionFlightSearch(currentFlightsList.retrieve(), selectedDepartingAirport, selectedArrivalAirport);

        System.out.println("\n" + connections.size() + " connections found on route [ " + selectedDepartingAirport + " -> via -> " + selectedArrivalAirport + " ]");
        connections.entrySet().stream()
                .map(n -> n.getKey().getDepartureTime()
                        + " "
                        + n.getKey().getFlightNumber()
                        + " & "
                        + n.getValue().getFlightNumber()
                        + " via "
                        + n.getValue().getDepartureAirport()
                        + ", total flight time "
                        + Duration.between(n.getValue().getArrivalTime(), n.getKey().getDepartureTime()).toString().substring(3)
                        + ", change planes "
                        + Duration.between(n.getValue().getDepartureTime(), n.getKey().getArrivalTime()).toString().substring(3)
                        + ", arriving "
                        + n.getValue().getArrivalTime())
                .sorted()
                .forEach(System.out::println);
    }
}



