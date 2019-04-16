package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatternsMain {
    public static void main( String[] args ) {
//13.1
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> newList = movieStore.getMovies();

        String movieTitles = newList.entrySet().stream()
                .map(n -> n.getValue())
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!", "Movie titles from the store: ", ""));

     //   System.out.println(movieTitles);

// 13.2
        System.out.println("Moduł 13.2");
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailNotification(), new OrderKapcie(), new KapcieOrderRepository());
        productOrderProcessor.process(orderRequest);
    }
}


