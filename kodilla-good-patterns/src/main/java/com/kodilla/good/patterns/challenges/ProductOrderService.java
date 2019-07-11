package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private Product product;
    private Shipping shipping;
    private InformationService informationService;

    public ProductOrderService(final Shipping shipping, final InformationService informationService) {
        this.shipping = shipping;
        this.informationService = informationService;
    }

    public void makingOrder(OrderData  orderData) {
        boolean isOrderMade = product.readyToSend(orderData.getCustomer(), orderData.getSpecificProduct());

        if(isOrderMade) {
            informationService.sendInformation(orderData.getCustomer(), orderData.getSpecificProduct(), orderData.getMessenger());
        } else {
            System.out.println("Zamówienie nie powiodło się ");
        }
    }
}
