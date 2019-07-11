package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        OrderDataRetriver orderDataRetriver = new OrderDataRetriver();
        OrderData orderData = orderDataRetriver.retrive();

        ProductOrderService productOrderService = new ProductOrderService (new Messenger(), new MailingService());
        productOrderService.makingOrder(orderData);
    }
}
