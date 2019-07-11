package com.kodilla.good.patterns.challenges;

public class SpecificProduct implements Product {

    public String name;
    public int quantity;
    public int ageLimit;

    public SpecificProduct(String name, int quantity, int ageLimit) {
        this.name = name;
        this.quantity = quantity;
        this.ageLimit = ageLimit;
    }

    public String getName() {
        return name;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    @Override
    public boolean isItAvailable() {
        if(quantity > 0) {
            return true;
        }else {
            return false;
        }
    }


    public boolean readyToSend(Customer customer, SpecificProduct specificProduct) {
        if(specificProduct.isItAvailable() && customer.getAge() >= specificProduct.getAgeLimit() ) {
            return true;
        }else {
            return false;
        }
    }
}
