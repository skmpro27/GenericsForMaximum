package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class GenericsForMaximumTest {

    @Test
    public void givenMultipleInputReturnMaxInteger() {
        GenericsForMaximum<Integer> operation = new GenericsForMaximum<>(7, 5, 2, 4);
        int result = operation.compareGenericForMax();
        Assert.assertEquals(7, result);
    }

    @Test
    public void givenMultipleInputReturnMaxDouble() {
        GenericsForMaximum<Double> operation = new GenericsForMaximum<>(7.0, 2.1, 5.6, 4.6, 7.8, 9.8);
        double result = operation.compareGenericForMax();
        Assert.assertEquals(9.8, result, 1e-15);
    }

    @Test
    public void givenMultipleInputReturnMaxString() {
        GenericsForMaximum<String> operation = new GenericsForMaximum<>("Cat", "Apple", "Ball", "Dog", "Hen", "apple", "cat");
        String result = operation.compareGenericForMax();
        Assert.assertEquals("cat", result);
    }
}
