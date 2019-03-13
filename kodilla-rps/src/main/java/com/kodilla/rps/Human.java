package com.kodilla.rps;

import java.util.Scanner;

public class Human extends Player {

    public Human(String name) {
        super(name);
    }

    @Override
    public void showPoints() {
        System.out.println("Twoja licba punktów to " + getPoints());
    }



    @Override
    public int getMove() {
        Scanner scanner = new Scanner(System.in);
        int move = scanner.nextInt();
        return move;
    }

}
