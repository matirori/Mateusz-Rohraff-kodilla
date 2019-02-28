package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

final public class World {
    private final Set<Continent>  continentsOnEarth = new HashSet<>();

    void addContinents(Continent continent) {
        continentsOnEarth.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continentsOnEarth.stream()
                .flatMap(continent -> continent.getCountriesOnTheContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
