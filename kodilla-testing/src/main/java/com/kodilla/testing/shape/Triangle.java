package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        double p = (a+b+c)/2;
        return Math.sqrt ( p*(p-a) * (p-b) * (p-c) );
    }
}
