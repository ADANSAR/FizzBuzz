package com.fizzbuzz.model;

public class Fizz extends FizzBuzzObject {

    public static final String FIZZ = "...Fizz...";
    public static final int FIZZ_NUMBER = 3;

    public Fizz() {
        super(FIZZ_NUMBER);
    }

    @Override
    public void print(int number) {
        if (isDivisible(number) || containsRepresentativeNumber(number)) {
            System.out.println(FIZZ);
        }
    }
}
