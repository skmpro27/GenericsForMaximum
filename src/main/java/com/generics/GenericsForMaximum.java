package com.generics;

public class GenericsForMaximum<X extends Comparable<X>> {
    X value1;
    X value2;
    X value3;

    public GenericsForMaximum(X value1, X value2, X value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public X compareGenericForMax() {
        if (value1.compareTo(value2) > 0 && value1.compareTo(value3) > 0)
            return value1;
        else if (value2.compareTo(value3) > 0)
            return value2;
        else
            return value3;
    }
}
