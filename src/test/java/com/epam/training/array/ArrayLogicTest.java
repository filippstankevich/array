package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayLogicTest {

    private final ArrayLogic arrayLogic = new ArrayLogic();

    //TODO: add tests for various scenarios
    @Test
    public void testIfValueExistsInArray(){
        //given
        int[] exists = {2,1,3,5,6};
        Array array = new Array(exists);
        //then
        assertTrue(arrayLogic.exists(array, 5)); // checks if given element exists in given Array
        assertFalse(arrayLogic.exists(array, 10)); // checks if given element do not exist in given Array
    }

    @Test
    public void testForPrimeNumbers(){
        //given
        int[] testArray = {1,2,3,4,5};
        int[] expected = {2,3,5};
        Array array = new Array(testArray);
        //when
        Array result = arrayLogic.findPrimeNumbers(array);
        //then
        assertArrayEquals(expected, result.getItems());
    }

    @Test
    public void testArrayMaximumValue(){
        //given
        int[] testArray = {2,1,3,5,6};
        Array array = new Array(testArray);
        //when
        int max = arrayLogic.maxArrayValue(array);
        //then
        Assert.assertEquals(6, max); // checks if 6 is maximum value in array
    }

    @Test
    public void testArrayMinimumValue(){
        //given
        int[] testArray = {2,1,3,5,6};
        Array array = new Array(testArray);
        //when
        int min = arrayLogic.minArrayValue(array);
        //then
        Assert.assertEquals(1, min); //checks if 1 is minimum value in array
    }

}
