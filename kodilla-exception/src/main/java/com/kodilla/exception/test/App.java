package com.kodilla.exception.test;

public class App {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Nice"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Wejherowo"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Rome"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
    }
}
