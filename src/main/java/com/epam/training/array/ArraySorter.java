package com.epam.training.array;

import java.util.Arrays;

public class ArraySorter {

    public static Array sort(Array array) {

        if (array.getItems() == null){
            return array;
        }

        int[] arrayToSort= array.getItems();

        Arrays.sort(arrayToSort);
        Array result = new Array(arrayToSort);
        return result;
    }
}
