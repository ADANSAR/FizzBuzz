package com.fizzbuzz.impl;

import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.fizzbuzz.interfaces.FizzBuzz;
import com.fizzbuzz.model.Buzz;
import com.fizzbuzz.model.Context;
import com.fizzbuzz.model.Fizz;
import com.fizzbuzz.model.NoFizzNoBuzz;

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
        Context context = new Context(new Fizz(), new Buzz(), new NoFizzNoBuzz());
        fizzBuzzList.forEach(context::proceed);
    }

}
