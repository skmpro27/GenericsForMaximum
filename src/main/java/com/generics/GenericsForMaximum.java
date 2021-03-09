package com.generics;

public class GenericsForMaximum {

    public Integer compareIntegerForMax(Integer num1, Integer num2, Integer num3) {
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            return num1;
        else if (num2.compareTo(num3) > 0)
            return num2;
        else
            return num3;
    }
}
