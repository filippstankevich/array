package com.epam.training.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySorterTest {

    private final ArraySorter arraySorter = new ArraySorter();

    //TODO: uncomment test when junit dependency is added
    @Test
    public void testSortShouldSortWhenPositiveNumbers(){
        int[] testArray = {3,2,4,1};
        int[] expected = {1,2,3,4};
        Array array = new Array(testArray);
        //when
        arraySorter.sort(array);
        //then
        assertArrayEquals(expected, array.getItems());
    }

    //TODO: add tests for other positive and negative scenarios
    @Test
    public void testSortForAllArrayNumbers(){
        //given
        int[] testArray = {7,6,5,4,-1};
        int[] expected = {-1,4,5,6,7};
        Array array = new Array(testArray);
        //when
        arraySorter.sort(array);
        //then
        assertArrayEquals(expected, array.getItems());
    }
}
