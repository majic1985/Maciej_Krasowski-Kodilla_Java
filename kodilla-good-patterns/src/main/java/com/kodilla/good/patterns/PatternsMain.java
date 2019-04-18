package com.kodilla.good.patterns;

import com.kodilla.good.patterns.food2door.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.food2door.*;

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
       // System.out.println("Moduł 13.2");
       // OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        //OrderRequest orderRequest = orderRequestRetriever.retrieve();
        //ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailNotification(), new OrderKapcie(), new KapcieOrderRepository());
        //productOrderProcessor.process(orderRequest);
        // 13.4 "Food2Door"

        ProductListRetriever productListRetriever = new ProductListRetriever();
        ProductList productList = productListRetriever.retrieve();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ShoppingBasket userBasket = orderRequestRetriever.retrieve(productList.getProductList());

        Food2DoorProcessor extraFoodShopOrders = new Food2DoorProcessor(new ExtraFoodShop());
        extraFoodShopOrders.process(userBasket);

        Food2DoorProcessor healthyShopOrders = new Food2DoorProcessor(new HealthyShop());
        healthyShopOrders.process(userBasket);

        Food2DoorProcessor glutenFreeShopOrders = new Food2DoorProcessor(new GlutenFreeShop());
        glutenFreeShopOrders.process(userBasket);
    }
}


