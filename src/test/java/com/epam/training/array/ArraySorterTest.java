package com.epam.training.array;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    @Test
    public void testSortShouldSortWhenPositiveNumbers(){
        int[] items = new int[]{1,3,2,4,5};
        Array array = new Array(items);
        int[] sortedItems = new int[]{1,2,3,4,5};
        ArraySorter arraySorter = new ArraySorter();
        Array sortedArray = arraySorter.sort(array);
        Assert.assertArrayEquals(sortedItems, sortedArray.getItems());
    }

    @Test
    public void testSortShouldSortWhenNegativeNumbers(){
        int[] items = new int[]{-1,-3,-2,-4,-5};
        Array array = new Array(items);
        int[] sortedItems = new int[]{-5,-4,-3,-2,-1};
        ArraySorter arraySorter = new ArraySorter();
        Array sortedArray = arraySorter.sort(array);
        Assert.assertArrayEquals(sortedItems, sortedArray.getItems());
    }
}
