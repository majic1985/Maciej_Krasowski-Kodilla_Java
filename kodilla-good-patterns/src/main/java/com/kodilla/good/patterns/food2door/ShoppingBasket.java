package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;

public class ShoppingBasket {
    private User user;
    private HashMap<Product, BigDecimal> shoppingBasket = new HashMap<>();

    public ShoppingBasket(User user) {
        this.user = user;
    }

    public void addToBasket(Product productToAdd, BigDecimal quantity) {
        shoppingBasket.put(productToAdd, quantity);
    }

    public User getUser() {
        return user;
    }

    public HashMap<Product, BigDecimal> getShoppingBasket() {
        return shoppingBasket;
    }
}
