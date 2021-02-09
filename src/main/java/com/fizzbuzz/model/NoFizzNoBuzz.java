package com.fizzbuzz.model;

import com.fizzbuzz.utils.Constants;
import com.fizzbuzz.utils.FizzBuzzUtils;

public class NoFizzNoBuzz extends FizzBuzzObject {

    public NoFizzNoBuzz() {
        super();
    }

    @Override
    public void print(int number) {
        if (isDivisible(number)) {
            System.out.println(number);
        }
    }

    @Override
    public boolean isDivisible(int number) {
        if (!FizzBuzzUtils.numberIsMultipleOfAnotherNumber(number, Constants.FIZZ_NUMBER)) {
            return !FizzBuzzUtils.numberIsMultipleOfAnotherNumber(number, Constants.BUZZ_NUMBER);
        } else if (!FizzBuzzUtils.numberIsMultipleOfAnotherNumber(number, Constants.BUZZ_NUMBER)) {
            return !FizzBuzzUtils.numberIsMultipleOfAnotherNumber(number, Constants.FIZZ_NUMBER);
        } else {
            return false;
        }
    }

}
