package com.fizzbuzz.impl;

import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.fizzbuzz.interfaces.FizzBuzz;
import com.fizzbuzz.model.FizzBuzzObject;

/**
 * Standard FizzBuzz
 */
@Service
public class StandardFizzBuzz implements FizzBuzz {

    /**
    *
    */
    public StandardFizzBuzz() {
        super();
    }

    /**
     * @param nFizzBuzzMax
     */
    @Override
    public void fizzBuzz(final int nFizzBuzzMax) {
        IntStream fizzBuzzList = IntStream.rangeClosed(1, nFizzBuzzMax);
        fizzBuzzList.mapToObj(FizzBuzzObject::new).forEach(FizzBuzzObject::printText);
    }

}
