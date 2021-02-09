package com.fizzbuzz.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Context {

    List<FizzBuzzObject> fizzBuzz = new ArrayList<>();

    /**
     *
     * @param fizzBuzz
     */
    public Context(FizzBuzzObject... fizzBuzz) {
        Arrays.stream(fizzBuzz).forEach(a -> this.fizzBuzz.add(a));
    }

    /**
     *
     * @param number
     */
    public void proceed(int number) {
        for (FizzBuzzObject fbo : fizzBuzz) {
            fbo.print(number);
        }
    }

}
