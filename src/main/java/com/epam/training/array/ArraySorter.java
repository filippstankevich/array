package com.epam.training.array;

import java.util.Arrays;

public class ArraySorter {

    public Array sort(Array array) {
        //throw new UnsupportedOperationException();
        Arrays.sort(array.getItems());
        Array result = new Array(array,getItems());
        return result;
    }
}
