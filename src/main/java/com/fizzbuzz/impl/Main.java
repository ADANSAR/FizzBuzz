package com.fizzbuzz.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fizzbuzz.impl.parameters.DefaultFizzBuzzMaxParameter;
import com.fizzbuzz.interfaces.FizzBuzz;
import com.fizzbuzz.interfaces.parameters.FizzBuzzMaxParameter;

/**
 * Main
 */
public final class Main {

    public static final String SPRING_XML = "spring.xml";
    public static final String STANDARD_FIZZ_BUZZ = "standardFizzBuzz";

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_XML);
        final FizzBuzz myFizzBuzz = (FizzBuzz) context.getBean(STANDARD_FIZZ_BUZZ);
        final FizzBuzzMaxParameter fizzBuzzMax = new DefaultFizzBuzzMaxParameter();
        myFizzBuzz.fizzBuzz(fizzBuzzMax.obtainMaxValue());
        ((ConfigurableApplicationContext) context).close();
    }

}
