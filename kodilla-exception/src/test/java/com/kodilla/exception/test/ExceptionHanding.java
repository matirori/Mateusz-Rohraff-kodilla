package com.kodilla.exception.test;

public class ExceptionHanding {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("Znaleziono wyjątek");
        } finally {
            System.out.println("Proces zakończony");
        }
    }
}