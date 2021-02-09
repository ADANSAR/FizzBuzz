package com.fizzbuzz.interfaces;

public interface FizzBuzzBehaviour {

    /**
     * return boolean
     *
     * check if an object is divisible
     */
    public boolean isDivisible(int number);

    /**
     * return boolean
     *
     * check if an object contains the representative number
     */
    public boolean containsRepresentativeNumber(int number);

    /**
     *
     * @param number
     *
     *            print the fizzbuzz
     */
    public void print(int number);

}
