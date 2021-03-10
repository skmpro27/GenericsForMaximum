package com.generics;

import java.util.Arrays;

public class GenericsForMaximum<X extends Comparable<X>> {
    X[] values;

    @SafeVarargs
    public GenericsForMaximum(X... values) {
        this.values = values;
    }

    public X compareGenericForMax() {
        Arrays.sort(values);
        return values[values.length - 1];
    }
}
