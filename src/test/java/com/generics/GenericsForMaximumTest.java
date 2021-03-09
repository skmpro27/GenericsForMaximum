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
    public void givenMaxNumberFirstPositionReturnSame() {
        int result = operation.compareIntegerForMax(7, 2, 5);
        Assert.assertEquals(7, result);
    }

    @Test
    public void givenMaxNumberSecondPositionReturnSame() {
        int result = operation.compareIntegerForMax(7, 8, 5);
        Assert.assertEquals(8, result);
    }

    @Test
    public void givenMaxNumberThirdPositionReturnSame() {
        int result = operation.compareIntegerForMax(7, 2, 10);
        Assert.assertEquals(10, result);
    }
}
