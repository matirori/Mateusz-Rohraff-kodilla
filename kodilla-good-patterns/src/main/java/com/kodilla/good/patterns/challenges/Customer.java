package com.kodilla.good.patterns.challenges;

public class Customer {

    public String name;
    public String surname;
    public String country;
    public int age;

    public Customer(String name, String surname, String country, int age) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }
}
