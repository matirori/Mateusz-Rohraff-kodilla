package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player {

    public Computer(String name) {
        super(name);
    }

    @Override
    public void showPoints() {
        System.out.println("Liczba punktów twojego przeciwnika to " + getPoints());
    }

    Random genarator = new Random();

    @Override
    public int getMove() {
        int n = genarator.nextInt(3);
        n += 1;
        return n;
    }
}
