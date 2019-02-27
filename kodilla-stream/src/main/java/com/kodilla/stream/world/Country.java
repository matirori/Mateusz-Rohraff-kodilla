package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    String countryName;
    BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public  BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}
