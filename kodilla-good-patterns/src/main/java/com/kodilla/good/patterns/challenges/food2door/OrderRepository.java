package com.kodilla.good.patterns.challenges.food2door;

public interface OrderRepository {
    boolean createOrder(Product product, Supplier supplier);
}
