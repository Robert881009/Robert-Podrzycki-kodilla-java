package com.kodilla.good.patterns.challenges.order;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),new ShoesOrderService(),new ShoesOrderRepository());
        orderProcessor.process(orderRequest);

    }
}
