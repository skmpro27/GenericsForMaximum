package com.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericsForMaximumTest {

    public GenericsForMaximum operation;

    @Before
    public void setUp() throws Exception {
        operation = new GenericsForMaximum();
    }

    @Test
    public void givenMaxNumberFirstPositionReturnSameInteger() {
        int result = operation.compareGenericForMax(7, 2, 5);
        Assert.assertEquals(7, result);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameInteger() {
        int result = operation.compareGenericForMax(7, 8, 5);
        Assert.assertEquals(8, result);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameInteger() {
        int result = operation.compareGenericForMax(7, 2, 10);
        Assert.assertEquals(10, result);
    }

    @Test
    public void givenMaxNumberFirstPositionReturnSameDouble() {
        double result = operation.compareGenericForMax(7.0, 2.1, 5.6);
        Assert.assertEquals(7.0, result, 1e-15);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameDouble() {
        double result = operation.compareGenericForMax(7.6, 8.9, 5.4);
        Assert.assertEquals(8.9, result, 1e-15);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameDouble() {
        double result = operation.compareGenericForMax(7.5, 2.8, 10.6);
        Assert.assertEquals(10.6, result, 1e-15);
    }

    @Test
    public void givenMaxNumberFirstPositionReturnSameString() {
        String result = operation.compareGenericForMax("Cat", "Apple", "Ball");
        Assert.assertEquals("Cat", result);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSameString() {
        String result = operation.compareGenericForMax("Dog", "dog", "Cat");
        Assert.assertEquals("dog", result);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSameString() {
        String result = operation.compareGenericForMax("Hen", "Dog", "Van");
        Assert.assertEquals("Van", result);
    }
}
