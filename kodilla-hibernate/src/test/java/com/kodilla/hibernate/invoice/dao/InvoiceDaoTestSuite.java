package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Słuchawki");
        Product product1 = new Product("Klawiatura");

        Item item = new Item(new BigDecimal(120), 2, new BigDecimal(240));
        Item item1 = new Item(new BigDecimal(100), 5, new BigDecimal(500));
        Item item2 = new Item(new BigDecimal(50), 3, new BigDecimal(150));

        Invoice invoice = new Invoice(999);

        item.setProduct(product);
        item1.setProduct(product);
        item2.setProduct(product1);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int size = invoice.getItems().size();

        //Then
        Assert.assertEquals(3, size);

        //CleanUp
        //invoiceDao.delete(invoice);
    }
}
