package com.epam.training.array;

import java.util.Arrays;

public class ArraySorter {

    public Array sort(Array array) {
        int[] sortedArray = array.getItems();
        Arrays.sort(sortedArray);
        return new Array(sortedArray);
    }

}
