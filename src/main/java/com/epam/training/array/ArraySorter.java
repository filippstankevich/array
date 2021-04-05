package com.epam.training.array;
import java.util.Arrays;
public class ArraySorter {

    public Array sort(Array array) {
        int[] sortedItems = array.getItems();
        Arrays.sort(sortedItems);
        Array sortedArray = new Array(sortedItems);
        return sortedArray;
    }
}
