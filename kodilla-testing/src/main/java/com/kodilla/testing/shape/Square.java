package com.kodilla.testing.shape;

class Square implements Shape {
    private String name;
    private Double a;

    public Square(String name, Double a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return a * a;

    }
}