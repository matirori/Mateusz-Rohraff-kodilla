package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.HOURS;

public class PostOffice implements Shipping{

    @Override
    public int costOfShipping(Customer customer) {
        if(customer.getCountry().equals("Poland")) {
            return 50;
        }else {
            return 100;
        }
    }

    @Override
    public LocalDate timeToDeliver(Customer customer) {
        if(customer.getCountry().equals("Poland")) {
            return LocalDate.now().plus(72, HOURS);
        }else{
            return LocalDate.now().plus(96, HOURS);
        }
    }
}
