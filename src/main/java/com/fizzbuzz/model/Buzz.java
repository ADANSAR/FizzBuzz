package com.fizzbuzz.model;

public class Buzz extends FizzBuzzObject {

    public static final String BUZZ = "...Buzz...";
    public static final int BUZZ_NUMBER = 5;

    public Buzz() {
        super(BUZZ_NUMBER);
    }

    @Override
    public void print(int number) {
        if (isDivisible(number) || containsRepresentativeNumber(number)) {
            System.out.println(BUZZ);
        }
    }
}
