package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = this.orderService.orderRequest(orderRequest.getUser(), orderRequest.getProductType(), orderRequest.getTransactionDate());
        if (isOrdered) {
            this.informationService.informUser(orderRequest.getUser(), orderRequest);
            this.orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProductType(), orderRequest.getTransactionDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
