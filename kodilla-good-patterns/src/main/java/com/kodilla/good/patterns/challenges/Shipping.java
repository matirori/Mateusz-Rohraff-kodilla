package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface Shipping {

    int costOfShipping(Customer customer);
    LocalDate timeToDeliver(Customer customer);
}
