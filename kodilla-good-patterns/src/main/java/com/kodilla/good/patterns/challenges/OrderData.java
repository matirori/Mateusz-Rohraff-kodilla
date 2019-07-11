package com.kodilla.good.patterns.challenges;

public class OrderData {

    private Customer customer;
    private SpecificProduct specificProduct;
    private Messenger messenger;
    private int orderID;

    public OrderData(final Customer customer, final SpecificProduct specificProduct, final Messenger messenger, final int orderID) {
        this.customer = customer;
        this.specificProduct = specificProduct;
        this.messenger = messenger;
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public SpecificProduct getSpecificProduct() {
        return specificProduct;
    }

    public Messenger getMessenger() {
        return messenger;
    }

    public int getOrderID() {
        return orderID;
    }
}
