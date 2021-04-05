package com.epam.training.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySorterTest {

    @Test
    public void shouldSortWhenPositiveNumbers(){
        int[] items = {1, 3, 44, 50, 10, 11, 13, 8, 15, 33};
        int[] sortedItems = {1, 3, 8, 10, 11, 13, 15, 33, 44, 50};

        Array array = new Array(items);
        Array expectedSortedArray = new Array(sortedItems);

        ArraySorter.sort(array);

        assertArrayEquals(array.getItems(), expectedSortedArray.getItems());
    }

    @Test
    public void shouldSortWhenNegativeNumbers(){
        int[] items = {1, 3, -44, 50, 10, 11, -13, 8, 15, 33};
        int[] sortedItems = {-44, -13, 1, 3, 8, 10, 11, 15, 33, 50};

        Array array = new Array(items);
        Array expectedSortedArray = new Array(sortedItems);

        ArraySorter.sort(array);

        assertArrayEquals(array.getItems(), expectedSortedArray.getItems());
    }
}
