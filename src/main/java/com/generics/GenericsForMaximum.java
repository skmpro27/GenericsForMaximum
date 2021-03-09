package com.generics;

public class GenericsForMaximum {

    public <E extends Comparable<E>> E compareGenericForMax(E value1, E value2, E value3) {
        if (value1.compareTo(value2) > 0 && value1.compareTo(value3) > 0)
            return value1;
        else if (value2.compareTo(value3) > 0)
            return value2;
        else
            return value3;
    }
}
