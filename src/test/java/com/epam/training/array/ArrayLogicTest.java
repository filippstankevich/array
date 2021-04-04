package com.epam.training.array;

import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayLogicTest {

    @Test
    public void testExists(){
        int[] ints = {3,6,2};
        Array array = new Array(ints);
        boolean exists = ArrayLogic.exists(array,3);
        boolean notExists = ArrayLogic.exists(array,7);
        assertTrue(exists);
        assertFalse(notExists);


    }

    @Test
    public void testMaxMin(){
        int[] ints = {3,6,2};
        Array array = new Array(ints);
        int max = ArrayLogic.max(array);
        int min = ArrayLogic.min(array);

        assertEquals(max,6);
        assertEquals(min,2);

    }
    @Test
    public void testFindPrimeNumbers(){
        int[] ints = {3,5,6,2};
        Array array = new Array(ints);
        Array primeNumbers = ArrayLogic.findPrimeNumbers(array);
        int size = primeNumbers.getItems().length;
        assertEquals(size, 3);

        int[] expected = {3,5,2};
        assertArrayEquals(primeNumbers.getItems(),expected);
    }

    @Test
    public void testSetItems(){
        int[] ints = {3,5,6,2};
        Array array = new Array(null);
        array.setItems(ints);
        int[] items = array.getItems();
        assertArrayEquals(items,ints) ;

    }

    @Test
    public void testToString(){
        Array array = new Array(null);
        assertEquals(array.toString(),"Array{items=null}");
        int[] ints = {3,5,6,2};
        array.setItems(ints);
        assertEquals(array.toString(),"Array{items=[3, 5, 6, 2]}");


    }

}
