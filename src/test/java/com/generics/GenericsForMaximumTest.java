package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class GenericsForMaximumTest {

    @Test
    public void givenMaxNumberFirstPositionReturnSameInteger() {
        GenericsForMaximum<Integer> operation = new GenericsForMaximum<>(7, 5, 2);
        int result = operation.compareGenericForMax();
        Assert.assertEquals(7, result);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameInteger() {
        GenericsForMaximum<Integer> operation = new GenericsForMaximum<>(7, 8, 2);
        int result = operation.compareGenericForMax();
        Assert.assertEquals(8, result);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameInteger() {
        GenericsForMaximum<Integer> operation = new GenericsForMaximum<>(7, 5, 10);
        int result = operation.compareGenericForMax();
        Assert.assertEquals(10, result);
    }

    @Test
    public void givenMaxNumberFirstPositionReturnSameDouble() {
        GenericsForMaximum<Double> operation = new GenericsForMaximum<>(7.0, 2.1, 5.6);
        double result = operation.compareGenericForMax();
        Assert.assertEquals(7.0, result, 1e-15);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameDouble() {
        GenericsForMaximum<Double> operation = new GenericsForMaximum<>(7.6, 8.9, 5.4);
        double result = operation.compareGenericForMax();
        Assert.assertEquals(8.9, result, 1e-15);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameDouble() {
        GenericsForMaximum<Double> operation = new GenericsForMaximum<>(7.5, 2.8, 10.6);
        double result = operation.compareGenericForMax();
        Assert.assertEquals(10.6, result, 1e-15);
    }

    @Test
    public void givenMaxNumberFirstPositionReturnSameString() {
        GenericsForMaximum<String> operation = new GenericsForMaximum<>("Cat", "Apple", "Ball");
        String result = operation.compareGenericForMax();
        Assert.assertEquals("Cat", result);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameString() {
        GenericsForMaximum<String> operation = new GenericsForMaximum<>("Dog", "dog", "Cat");
        String result = operation.compareGenericForMax();
        Assert.assertEquals("dog", result);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameString() {
        GenericsForMaximum<String> operation = new GenericsForMaximum<>("Hen", "Dog", "Van");
        String result = operation.compareGenericForMax();
        Assert.assertEquals("Van", result);
    }
}
