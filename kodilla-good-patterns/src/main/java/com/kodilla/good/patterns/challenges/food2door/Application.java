package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new ShopInformation(), new ShopRepository());
        extraFoodShop.processProducer(orderRequest);
    }

}
