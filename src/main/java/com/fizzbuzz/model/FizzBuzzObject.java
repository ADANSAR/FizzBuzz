package com.fizzbuzz.model;

import com.fizzbuzz.interfaces.FizzBuzzBehaviour;
import com.fizzbuzz.utils.FizzBuzzUtils;

public abstract class FizzBuzzObject implements FizzBuzzBehaviour {

    private Integer number;

    public FizzBuzzObject() {
        // default constructor
    }

    public FizzBuzzObject(int number) {
        this.number = number;
    }

    @Override
    public boolean isDivisible(int number) {
        return FizzBuzzUtils.numberIsMultipleOfAnotherNumber(number, this.number);
    };

    @Override
    public boolean containsRepresentativeNumber(int number) {
        if (this.number == null) {
            return false;
        }
        return this.number.toString().contains(String.valueOf(number));
    }

    @Override
    public abstract void print(int number);
}
