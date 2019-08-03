package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Drive to home", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaksExecuted());
        drivingTask.executeTask();
        Assert.assertEquals(true, drivingTask.isTaksExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Paint ASAP", paintingTask.getTaskName());
        Assert.assertEquals(false, paintingTask.isTaksExecuted());
        paintingTask.executeTask();
        Assert.assertEquals(true, paintingTask.isTaksExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Food Shopping", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaksExecuted());
        shoppingTask.executeTask();
        Assert.assertEquals(true, shoppingTask.isTaksExecuted());
    }
}
