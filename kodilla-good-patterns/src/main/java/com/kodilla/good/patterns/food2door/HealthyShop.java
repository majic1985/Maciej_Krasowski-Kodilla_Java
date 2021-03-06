package com.kodilla.good.patterns.food2door;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HealthyShop implements OrderService{
    public void process(User user, ShoppingBasket shoppingBasket) {

        List<Product> newList = shoppingBasket.getShoppingBasket().entrySet().stream()
                .filter(n -> n.getKey().getSupplierName().equals("HealthyShop"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.print("\n HealthyShop proceeds with order for " + user.getUser() + " for total number of " + newList.size() + " items: ");
        newList.stream().map(n -> n.getProductName() + " ").forEach(System.out::print);
    }
}
