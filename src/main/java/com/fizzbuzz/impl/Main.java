package com.fizzbuzz.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fizzbuzz.impl.parameters.DefaultFizzBuzzMaxParameter;
import com.fizzbuzz.interfaces.FizzBuzz;
import com.fizzbuzz.interfaces.parameters.FizzBuzzMaxParameter;
import com.fizzbuzz.utils.Constants;

/**
 * Main
 */
public final class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
        final FizzBuzz myFizzBuzz = (FizzBuzz) context.getBean(Constants.STANDARD_FIZZ_BUZZ);
        final FizzBuzzMaxParameter fizzBuzzMax = new DefaultFizzBuzzMaxParameter();
        myFizzBuzz.fizzBuzz(fizzBuzzMax.obtainMaxValue());
        ((ConfigurableApplicationContext) context).close();
    }

}
