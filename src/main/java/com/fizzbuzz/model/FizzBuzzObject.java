package com.fizzbuzz.model;

import java.io.PrintStream;

import com.fizzbuzz.utils.Constants;

public class FizzBuzzObject {

    private int number;
    private boolean dividedBy3;
    private boolean dividedBy5;
    private PrintStream textPrinter;

    public FizzBuzzObject(int number) {
        this.number = number;
        dividedBy3 = number % 3 == 0;
        dividedBy5 = number % 5 == 0;
        textPrinter = System.out;
    }

    public void printText() {
        if (!dividedBy3 && !dividedBy5) {
            textPrinter.println(String.valueOf(number));
        } else {
            if (dividedBy3) {
                textPrinter.println(String.valueOf(Constants.FIZZ));
            }
            if (dividedBy5) {
                textPrinter.println(String.valueOf(Constants.BUZZ));
            }
        }
    }

}
