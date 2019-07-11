package com.kodilla.good.patterns.challenges;

public class OrderDataRetriver {

    public OrderData retrive() {
        Customer customer = new Customer("Mateusz", "Kowalski", "Poland", 20);
        SpecificProduct specificProduct = new SpecificProduct("Kapcie", 5,18);
        Messenger messenger = new Messenger();
        int OrderID = 1;

        return new OrderData(customer, specificProduct, messenger, OrderID);
    }
}
