package com.kodilla.good.patterns.food2door;

public class Food2DoorProcessor {
    private OrderService orderService;

    public Food2DoorProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public void process(final ShoppingBasket userBasket) {

        orderService.process(userBasket.getUser(), userBasket);
    }
}
