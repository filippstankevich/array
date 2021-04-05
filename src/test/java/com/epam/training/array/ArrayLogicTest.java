package com.epam.training.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLogicTest {

    private final int[] items = {1, 3, 44, 50, 10, 11, 13, 8, 15, 33};
    private Array array = new Array(items);


    @Test
    public void shouldArrayNumberExist() {
        boolean exists = ArrayLogic.exists(array, 1);
        assertTrue(exists);
    }

    @Test
    public void shouldArrayNumberNotExist() {
        boolean exists = ArrayLogic.exists(array, 4);
        assertFalse(exists);
    }

    @Test
    public void shouldGetMaxValue() {
        int max = ArrayLogic.getMaxValue(array);
        assertEquals(50, max);
    }

    @Test
    public void shouldGetMinValue() {
        int min = ArrayLogic.getMinValue(array);
        assertEquals(1, min);
    }

    @Test
    public void shouldReturnPrimeNumberList() {
        Array primeNumbersArray = ArrayLogic.findPrimeNumbers(array);
        int[] expected = {44, 50, 10, 8};
        assertArrayEquals(expected, primeNumbersArray.getItems());
    }
}
