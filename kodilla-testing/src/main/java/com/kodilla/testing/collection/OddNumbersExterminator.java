package com.kodilla.testing.collection;

import java.util.ArrayList;


public class OddNumbersExterminator {


    public void exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> numbersAfterExtraction = new ArrayList<>();
        for (Integer number : numbers) {
            if (number%2 == 0){
                numbersAfterExtraction.add(number);
            }
        }
        System.out.println("Tablica utworzona z liczb parzystych ma wielkość " + numbersAfterExtraction.size());
    }
}
