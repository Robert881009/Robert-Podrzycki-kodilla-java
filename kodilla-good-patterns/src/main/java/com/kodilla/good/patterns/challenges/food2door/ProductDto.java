package com.kodilla.good.patterns.challenges.food2door;

public class ProductDto {
    private Product product;
    private boolean isAvailable;

    public ProductDto(Product product, boolean isAvailable) {
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
