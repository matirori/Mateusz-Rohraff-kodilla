package com.kodilla.testing.shape;

public class Squere implements Shape {

    int side;
    int side2;

    public Squere(int side, int side2) {
        this.side = side;
        this.side2 = side2;
    }

    @Override
    public String getShapeName() {
        return "Squere";
    }

    @Override
    public double getField() {
        return side * side2;
    }
}
