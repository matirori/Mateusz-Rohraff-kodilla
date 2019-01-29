package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator number = new Calculator(5,2);

        int result = number.add();

        if(result == 5+2){
            System.out.println("Everything working properly");
        }else{
            System.out.println("Something is wrong");
        }

        result = number.substract();

        if (result == 5-2){
            System.out.println("Everything working properly");
        }else{
            System.out.println("Something is wrong");
        }
    }
}
