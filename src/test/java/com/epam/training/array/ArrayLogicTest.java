package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayLogicTest {
    @Test
    public void testConstruct(){
        Array array = new Array(6);
        int[] items = array.getItems();
        Assert.assertEquals(6, items.length);
    }
    @Test
    public void secondTestConstruct(){
        Array array = new Array(6,1);
        int[] items = array.getItems();
        int[] expected = new int[]{1, 1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expected, items);
    }
    @Test
    public void thirdTestConstruct(){
        int[] items = new int[]{1,2,3,4,5};
        Array array = new Array(items);
        Assert.assertArrayEquals(items, array.getItems());
    }    
    @Test
    public void toStringTest(){
        int[] items = new int[]{1,2,3,4,5};
        Array array = new Array(items);
        Assert.assertEquals("[1, 2, 3, 4, 5]", array.toString());
    }
    @Test
    public void equalsTest(){
        int[] items = new int[]{1,2,3,4,5};
        Array myArray1 = new Array(items);
        Array myArray2 = new Array(items);
        Assert.assertTrue(myArray1.equals(myArray2));
    }
    @Test
    public void nonEqualsTest(){
        int[] items1 = new int[]{1,2,3,4,5};
        int[] items2 = new int[]{1,2,2,4,5};
        Array myArray1 = new Array(items1);
        Array myArray2 = new Array(items2);
        Assert.assertFalse(myArray1.equals(myArray2));
    }
    @Test
    public void hashCodeTest() {
        int[] items = new int[]{1,2,3,4,5};
        Array myArray1 = new Array(items);
        Array myArray2 = new Array(items);
        Assert.assertTrue(myArray1.hashCode() == myArray2.hashCode());
    }
    @Test
    public void binariSearchTest() {
        int[] items = new int[]{1};
        Array array = new Array(items);
        Assert.assertEquals(0, ArrayLogic.binarySearch(array.getItems(), 1));
    }
    @Test
    public void SearchMinTest(){
        int[] items = new int[]{1,2,6,10};
        Array array = new Array(items);
        ArrayLogic arrayLogic = new ArrayLogic();
        int minValue = arrayLogic.SearchMin(array);
        Assert.assertEquals(1, minValue);
    }
    @Test
    public void SearchMaxTest(){
        int[] items = new int[]{1,2,6,10};
        Array array = new Array(items);
        ArrayLogic arrayLogic = new ArrayLogic();
        int maxValue = arrayLogic.SearchMax(array);
        Assert.assertEquals(10, maxValue);
    }
    @Test
    public void findPrimeNumbersTest(){
        int[] items = new int[]{1,2,3,4,10,13};
        int[] expected = new int[]{1,2,3,13};
        Array array = new Array(items);
        ArrayLogic arrayLogic = new ArrayLogic();
        Array primeNumbes = arrayLogic.findPrimeNumbers(array);
        Assert.assertArrayEquals(expected, primeNumbes.getItems());
    }
    @Test
    public void findPrimeNumbersForNegativeTest(){
        int[] items = new int[]{-1,-2,-3,-4,-10,13};
        int[] expected = new int[]{-1,-2,-3,13};
        Array array = new Array(items);
        ArrayLogic arrayLogic = new ArrayLogic();
        Array primeNumbes = arrayLogic.findPrimeNumbers(array);
        Assert.assertArrayEquals(expected, primeNumbes.getItems());
    }
}
