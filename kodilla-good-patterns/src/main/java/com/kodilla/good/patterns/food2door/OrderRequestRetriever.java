package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderRequestRetriever {
    public ShoppingBasket retrieve( ArrayList<Product> productList) {

        User user = new User("(Majic)",
                "Maciej",
                "Krasek",
                LocalDate.of(1985,4,27), // DOB
                new LocalAddress("7 Queen Street",
                        "Ashford",
                        "TN23 7SB",
                        "UK"),
                745335558);

        ShoppingBasket userBasket = new ShoppingBasket(user);

        userBasket.addToBasket(productList.get(3), new BigDecimal(2.0));
        userBasket.addToBasket(productList.get(1), new BigDecimal(3.0));
        userBasket.addToBasket(productList.get(2), new BigDecimal(3.0));
        userBasket.addToBasket(productList.get(5), new BigDecimal(2.0));
        userBasket.addToBasket(productList.get(6), new BigDecimal(2.5));

        return userBasket;
    }
}

