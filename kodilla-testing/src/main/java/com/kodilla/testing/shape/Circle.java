package com.kodilla.testing.shape;

public class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return (Math.PI * (Math.pow(radius, 2)))/2 ;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
