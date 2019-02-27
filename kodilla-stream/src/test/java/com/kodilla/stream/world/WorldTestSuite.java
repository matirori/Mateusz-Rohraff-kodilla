package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Polska", new BigDecimal("100000"));
        Country country2 = new Country("Czechy", new BigDecimal("100000"));
        Country country3 = new Country("Niemcy", new BigDecimal("100000"));
        Country country4 = new Country("Brazylia", new BigDecimal("100000"));
        Country country5 = new Country("Argentyna", new BigDecimal("100000"));
        Country country6 = new Country("Kolumbia", new BigDecimal("100000"));
        Country country7 = new Country("Chiny", new BigDecimal("100000"));
        Country country8 = new Country("Japonia", new BigDecimal("100000"));
        Country country9 = new Country("Republika Południowej Afryki", new BigDecimal("100000"));
        Country country10 = new Country("Egipt", new BigDecimal("100000"));

        Continent continent1 = new Continent("Europa");
        Continent continent2 = new Continent("Ameryka Południowa");
        Continent continent3 = new Continent("Azja");
        Continent continent4 = new Continent("Afryka");

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);

        continent3.addCountry(country7);
        continent3.addCountry(country8);

        continent4.addCountry(country9);
        continent4.addCountry(country10);

        World.addContinents(continent1);
        World.addContinents(continent2);
        World.addContinents(continent3);
        World.addContinents(continent4);
        //When
        BigDecimal quantityOfPeople =  World.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("1000000"), quantityOfPeople);
    }
}
