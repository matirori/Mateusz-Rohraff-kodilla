package com.kodilla.good.patterns.challenges;

public class MailingService implements InformationService {
    @Override
    public void sendInformation(Customer customer, Product product, Shipping shipping) {
        System.out.println("Produkt o nazwie " + product.getName() + "Został wysłany do użytkownika " + customer.getName() + " " + customer.getSurname() + ". Czas oczekiwania na dostarczenie: " + shipping.timeToDeliver(customer));
    }
}
