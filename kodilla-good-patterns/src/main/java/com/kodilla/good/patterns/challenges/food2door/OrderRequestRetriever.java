package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {

    public OrderRequest retriever(){
    Supplier ExtraFoodShop = new Supplier("ExtraFoodShop");
    Product product = new Product("Banany", 10);

    return new OrderRequest(product,ExtraFoodShop);


}}
