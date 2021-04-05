package com.epam.training.array;

import java.util.Arrays;

public class ArraySorter {

    public static Array sort(Array array) {

        if (array.getItems() == null) {
            System.out.println("There are no items in array");
        }

        Arrays.sort(array.getItems());
        return new Array(array.getItems());
    }
}
