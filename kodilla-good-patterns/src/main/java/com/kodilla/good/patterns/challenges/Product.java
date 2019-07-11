package com.kodilla.good.patterns.challenges;

public interface Product {

    boolean isItAvailable();
    String getName();
    boolean readyToSend(Customer customer, SpecificProduct specificProduct );
}
