package com.kodilla.stream.world;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Continent {

    String continentName;
    Set<Country> countriesOnTheContinent = new HashSet<Country>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        countriesOnTheContinent.add(country);
    }

    public Set<Country> getCountriesOnTheContinent() {
        return countriesOnTheContinent;
    }
}

