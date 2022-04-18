package com.kodilla.testing.shape;

public interface Shape {
    String getShapeName();
    Double getField();
}
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
     class Triangle implements Shape{
        private String name;
        private Double a;
        private Double h;

        public Triangle(String name,Double a, Double h){
            this.name = name;
            this.a = a;
            this.h = h;
        }
        @Override
        public String getShapeName() {
            return name;
        }
        @Override
        public Double getField() {
            return 0.5 * a * h;
        }
    }

