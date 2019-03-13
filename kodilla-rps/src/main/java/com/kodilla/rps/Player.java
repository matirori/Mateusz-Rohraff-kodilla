package com.kodilla.rps;

public abstract class Player {
    private String name;
    private int points = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public abstract void showPoints();

    public abstract int getMove();

    public void showFinalScore(){
        System.out.println(getName() + ": " + getPoints());
    }

    public void removingPoints() {
        points = 0;
    }
}
