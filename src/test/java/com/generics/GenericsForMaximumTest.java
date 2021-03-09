package com.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericsForMaximumTest {

    GenericsForMaximum operation;

    @Before
    public void setUp() throws Exception {
        operation = new GenericsForMaximum();
    }

    @Test
    public void givenMaxNumberFirstPositionReturnSameInteger() {
        int result = operation.compareIntegerForMax(7, 2, 5);
        Assert.assertEquals(7, result);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameInteger() {
        int result = operation.compareIntegerForMax(7, 8, 5);
        Assert.assertEquals(8, result);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameInteger() {
        int result = operation.compareIntegerForMax(7, 2, 10);
        Assert.assertEquals(10, result);
    }

    @Test
    public void givenMaxNumberFirstPositionReturnSameDouble() {
        double result = operation.compareDoubleForMax(7.0, 2.1, 5.6);
        Assert.assertEquals(7.0, result, 1e-15);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameDouble() {
        double result = operation.compareDoubleForMax(7.6, 8.9, 5.4);
        Assert.assertEquals(8.9, result, 1e-15);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameDouble() {
        double result = operation.compareDoubleForMax(7.5, 2.8, 10.6);
        Assert.assertEquals(10.6, result, 1e-15);
    }
}
