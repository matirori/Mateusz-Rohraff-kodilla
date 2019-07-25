package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Given
        String log1 = "aaaaa";
        String log2 = "bbbbb";
        String log3 = "ccccc";
        String log4 = "ddddd";
        //When
        Logger.getInstance().log(log1);
        Logger.getInstance().log(log2);
        Logger.getInstance().log(log3);
        Logger.getInstance().log(log4);
        //Then
        Assert.assertEquals(log4 ,Logger.getInstance().getLastLog());
    }
}
