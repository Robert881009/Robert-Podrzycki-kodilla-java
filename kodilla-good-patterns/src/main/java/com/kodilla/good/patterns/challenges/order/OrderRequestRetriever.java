package com.kodilla.good.patterns.challenges.order;

public class OrderRequestRetriever {

    public OrderRequest retriever(){
        User user = new User("Marek","Kowalski");
        Product product = new Product("Shoes Nike Air",300);
        return new OrderRequest(user,product);
    }
}
