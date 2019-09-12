package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void updateTest () {
        //Given
        TaskQueue mateuszQueue = new TaskQueue("Mateusz");
        TaskQueue tadeuszQueue = new TaskQueue("Tadeusz");
        TaskQueue marekQueue = new TaskQueue("Marek");
        TaskQueue kamilQueue = new TaskQueue("Kamil");
        TaskQueue zdzisławQueue = new TaskQueue("Zdzisław");
        Mentor mateusz = new Mentor("Matesuz");
        Mentor kamil = new Mentor("Kamil");
        marekQueue.registerObserver(mateusz);
        mateuszQueue.registerObserver(mateusz);
        tadeuszQueue.registerObserver(mateusz);
        kamilQueue.registerObserver(kamil);
        zdzisławQueue.registerObserver(kamil);
        //When
        marekQueue.addTaskToQueue("zadanie 21");
        mateuszQueue.addTaskToQueue("zadanie 21");
        tadeuszQueue.addTaskToQueue("zadanie 21");
        zdzisławQueue.addTaskToQueue("zadanie 21");
        kamilQueue.addTaskToQueue("zadanie 22");
        //Then
        assertEquals(3, mateusz.getUpdateCount());
        assertEquals(2, kamil.getUpdateCount());
    }
}
