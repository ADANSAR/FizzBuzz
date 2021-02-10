package com.fizzbuzz.impl.parameters;

import com.fizzbuzz.interfaces.parameters.FizzBuzzMaxParameter;

/**
 * Parameter for DefaultFizzBuzzMaxLimit
 */
public final class DefaultFizzBuzzMaxParameter implements FizzBuzzMaxParameter {

    public static final int DEFAULT_FIZZ_BUZZ_MAX_PARAMETER_VALUE = 100;

    private final int fizzBuzzMaxParameterValue;

    /**
     *
     */
    public DefaultFizzBuzzMaxParameter() {
        fizzBuzzMaxParameterValue = DEFAULT_FIZZ_BUZZ_MAX_PARAMETER_VALUE;
    }

    /**
     * @param fizzBuzzMaxParameterValue
     *            int
     */
    public DefaultFizzBuzzMaxParameter(final int fizzBuzzMaxParameterValue) {
        this.fizzBuzzMaxParameterValue = fizzBuzzMaxParameterValue;
    }

    /**
     * @return int
     */
    @Override
    public int obtainMaxValue() {
        return fizzBuzzMaxParameterValue;
    }
}
