package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

final class Continent {
    final String continentName;
    final Set<Country> countriesOnTheContinent = new HashSet<Country>();

    Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        countriesOnTheContinent.add(country);
    }

    Set<Country> getCountriesOnTheContinent() {
        return countriesOnTheContinent;
    }
}

