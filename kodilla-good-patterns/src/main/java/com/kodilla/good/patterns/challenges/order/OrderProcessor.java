package com.kodilla.good.patterns.challenges.order;



public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public BoughtDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.order(orderRequest.getUser(),orderRequest.getProduct());

        if (isBought) {
            informationService.informationToUser(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new BoughtDto(orderRequest.getUser(), true);
        } else {
            System.out.println("product unavailable");
            return new BoughtDto(orderRequest.getUser(), false);
        }
    }


}
