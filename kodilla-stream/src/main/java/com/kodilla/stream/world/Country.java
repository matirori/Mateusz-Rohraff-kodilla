package com.kodilla.stream.world;

import java.math.BigDecimal;

final class Country {

    private final String countryName;
    private final BigDecimal peopleQuantity;

    Country(final String countryName,final BigDecimal peopleQuantity){
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}
