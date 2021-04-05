package com.epam.training.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLogic {

    public static boolean exists(Array array, int key) {
        Array sortedArray = ArraySorter.sort(array);

        int result = Arrays.binarySearch(sortedArray.getItems(), key);

        return result >= 0;
    }

    public static Array findPrimeNumbers(Array array) {

        List<Integer> primeNumberList = new ArrayList<>();
        int[] items = array.getItems();

        for (int item : items) {
            if (item % 2 == 0) {
                primeNumberList.add(item);
            }
        }

        int[] primeNumberArray = new int[primeNumberList.size()];

        for (int i = 0; i < primeNumberList.size(); i++) {
            primeNumberArray[i] = primeNumberList.get(i);
        }

        return new Array(primeNumberArray);
    }

    public static int getMaxValue(Array array) {

        int[] arrayItems = array.getItems();

        int maxValue = arrayItems[0];
        for (int i = 1; i < arrayItems.length; i++) {
            if (arrayItems[i] > maxValue) {
                maxValue = arrayItems[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(Array array) {

        int[] arrayItems = array.getItems();

        int minValue = arrayItems[0];
        for (int i = 1; i < arrayItems.length; i++) {
            if (arrayItems[i] < minValue) {
                minValue = arrayItems[i];
            }
        }
        return minValue;
    }
}
