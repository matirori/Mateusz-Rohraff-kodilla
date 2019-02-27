package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    static Set<Continent>  continentsOnEarth = new HashSet<>();

    public static void addContinents(Continent continent) {
        continentsOnEarth.add(continent);
    }

    public static BigDecimal getPeopleQuantity(){
        return continentsOnEarth.stream()
                .flatMap(continent -> continent.getCountriesOnTheContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
