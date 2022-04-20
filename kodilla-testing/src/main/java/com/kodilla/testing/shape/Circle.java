package com.kodilla.testing.shape;

class Circle implements Shape{
    private String name;
    private Double r;

    public Circle(String name, Double r){
        this.name = name;
        this.r = r;
    }
    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public Double getField() {
        return 3.14 * r * r;
    }
}