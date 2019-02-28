package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

final class Continent {
    private final String continentName;
    private final Set<Country> countriesOnTheContinent = new HashSet<Country>();

    Continent(final String continentName) {
        this.continentName = continentName;
    }

    void addCountry(Country country){
        countriesOnTheContinent.add(country);
    }

    Set<Country> getCountriesOnTheContinent() {
        return countriesOnTheContinent;
    }
}

