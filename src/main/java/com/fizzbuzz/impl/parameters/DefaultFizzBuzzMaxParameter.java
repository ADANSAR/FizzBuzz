package com.fizzbuzz.impl.parameters;

import com.fizzbuzz.interfaces.parameters.FizzBuzzMaxParameter;
import com.fizzbuzz.utils.Constants;

/**
 * Parameter for DefaultFizzBuzzMaxLimit
 */
public final class DefaultFizzBuzzMaxParameter implements FizzBuzzMaxParameter {

    private final int fizzBuzzMaxParameterValue;

    /**
     *
     */
    public DefaultFizzBuzzMaxParameter() {
        fizzBuzzMaxParameterValue = Constants.DEFAULT_FIZZ_BUZZ_MAX_PARAMETER_VALUE;
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
