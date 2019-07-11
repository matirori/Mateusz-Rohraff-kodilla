package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.HOURS;

public class Messenger implements Shipping {

    @Override
    public int costOfShipping(Customer customer) {
        if(customer.getCountry().equals("Poland")) {
            return 100;
        }else {
            return 200;
        }
    }

    @Override
    public LocalDate timeToDeliver(Customer customer) {
        if(customer.getCountry().equals("Poland")) {
            return LocalDate.now().plus(48, HOURS);
        }else{
            return LocalDate.now().plus(72, HOURS);
        }
    }
}
