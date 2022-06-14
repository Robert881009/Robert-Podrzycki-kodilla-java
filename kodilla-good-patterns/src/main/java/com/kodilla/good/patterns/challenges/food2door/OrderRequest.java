package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private Product product;
    private Supplier supplier;

    public OrderRequest(Product product, Supplier supplier) {
        this.product = product;
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
