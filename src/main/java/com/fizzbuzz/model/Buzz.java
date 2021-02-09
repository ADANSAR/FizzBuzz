package com.fizzbuzz.model;

import com.fizzbuzz.utils.Constants;

public class Buzz extends FizzBuzzObject {

    public Buzz() {
        super(Constants.BUZZ_NUMBER);
    }

    @Override
    public void print(int number) {
        if (isDivisible(number) || containsRepresentativeNumber(number)) {
            System.out.println(Constants.BUZZ);
        }
    }
}
