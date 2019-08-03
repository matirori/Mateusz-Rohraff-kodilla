package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void bigmacTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder().
                Bun("sesame bun")
                .Burgers(2)
                .Souce("barbecue")
                .build();
        System.out.println(bigmac);
        //When
        String bun = bigmac.getBun();
        int quantityOfBurgers = bigmac.getBurgers();
        String souce = bigmac.getSauce();
        //Then
        Assert.assertEquals("sesame bun", bun);
        Assert.assertEquals(2, quantityOfBurgers);
        Assert.assertEquals("barbecue", souce);
    }
}
