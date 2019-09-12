package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {


    public FlightFinder() {
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsToFly = new HashMap<>();
        flightsToFly.put("Heathrow", true);
        flightsToFly.put("Warsaw", true);
        flightsToFly.put("Rome", true);
        flightsToFly.put("Paris", false);
        flightsToFly.put("Nice", false);
        flightsToFly.put("Bari", false);

        if (flightsToFly.containsKey(flight.getArrivalAirport())) {
            Map<String, Boolean> resultMap = flightsToFly.entrySet().stream()
                    .filter(f -> f.getKey().equals(flight.getArrivalAirport()) && f.getValue() == true)
                    .collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue()));

            if (resultMap.size() == 0) {
                System.out.println("No flight to your destination");
            } else {
                resultMap.entrySet().stream().map(e -> "This is your flight to " + e.getKey()).forEach(System.out::println);
            }

        } else {
            throw new RouteNotFoundException("No such airport in database.");
        }
    }
}
