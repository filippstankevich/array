package com.epam.training.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {

    @Test
    public void testSortShouldSortWhenPositiveNumbers(){
        int[] array = {8,5,2};
        int[] sortedArray = {2,5,8};
        Array items = new Array(array);
        Array sortedItems = new Array(sortedArray);

        ArraySorter.sort(items);

        assertTrue(isSorted(items.getItems(), items.getItems().length));
        assertTrue(items.equals(sortedItems));
        assertArrayEquals(items.getItems(), sortedArray);
        assertEquals(items.hashCode(), sortedItems.hashCode());
    }

    private boolean isSorted(int[] array, int length) {
        if (array == null || length < 2)
            return true;
        if (array[length - 2] > array[length - 1])
            return false;
        return isSorted(array, length - 1);
    }

    //TODO: add tests for other positive and negative scenarios

    @Test
    public void testEmptyArraySort(){

        try {
            int[] array = {};
            Array items = new Array(array);
            ArraySorter.sort(items);
        }catch (Exception e){
            fail();
        }

    }
    @Test
    public void testNullArraySort(){

        try {
            Array items = new Array(null);
            ArraySorter.sort(items);
        }catch (Exception e){
            fail();
        }

    }

}
