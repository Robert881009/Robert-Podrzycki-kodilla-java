package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Producer{
    private Information information;
    private OrderRepository orderRepository;

    public ExtraFoodShop(Information information, OrderRepository orderRepository) {
        this.information = information;
        this.orderRepository = orderRepository;
    }

    @Override
    public ProductDto processProducer(OrderRequest orderRequest) {
        boolean isOrdered = information.orderInformation(orderRequest.getSupplier(),orderRequest.getProduct());
        if(isOrdered){
            System.out.println("Produkt jest dostepny. Udało sie zrealizować zamówienie.");
            orderRepository.createOrder(orderRequest.getProduct(), orderRequest.getSupplier());
            return new ProductDto(orderRequest.getProduct(),true);
        }else
            System.out.println("Produkt nie jest dostepny. Nie udało sie zrealizować zamówienia.");
            return new ProductDto(orderRequest.getProduct(),false);
    }
}
