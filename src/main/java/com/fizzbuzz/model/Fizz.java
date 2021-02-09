package com.fizzbuzz.model;

import com.fizzbuzz.utils.Constants;

public class Fizz extends FizzBuzzObject {

    public Fizz() {
        super(Constants.FIZZ_NUMBER);
    }

    @Override
    public void print(int number) {
        if (isDivisible(number) || containsRepresentativeNumber(number)) {
            System.out.println(Constants.FIZZ);
        }
    }
}
