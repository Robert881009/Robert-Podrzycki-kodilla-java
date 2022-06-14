package com.kodilla.good.patterns.challenges.food2door;

public class ShopRepository implements  OrderRepository {
    @Override
    public boolean createOrder(Product product, Supplier supplier) {
        return true;
    }
}
