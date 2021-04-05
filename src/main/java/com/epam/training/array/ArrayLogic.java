package com.epam.training.array;
import java.util.Arrays;

public class ArrayLogic {

    public boolean exists(Array array, int element) {
        int res = Arrays.binarySearch(array.getItems(), element);
        if (res >= 0) {
            return true;
        } 
        return false;
    }
    private boolean isPrimeNumber(int num){
        if (num < 0) {
            num = -1 * num;
        }
        for (int i = 2; i < num; i++){
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }    
    public Array findPrimeNumbers(Array array) {
        int[] items = array.getItems();
        int len = items.length;
        int[] preArrayPN = new int[len];
        int countPN = 0;
        for (int i = 0; i < len; i++) {
           if (isPrimeNumber(items[i])) {
               preArrayPN[countPN] = items[i];
               countPN += 1;
           }
        }
        int[] ArrayPN = new int[countPN];
        for (int i = 0; i < countPN; i++) {
            ArrayPN[i] = preArrayPN[i];
        }
        Array myArray = new Array(ArrayPN);
        return myArray;
    }
    
    public int SearchMin(Array array) {
        int[] items = array.getItems();
        int minValue = Integer.MAX_VALUE;
        int len = items.length;
        if (len == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < len; i++) {
            if (items[i] < minValue) {
                minValue = items[i];
            }
        }
        return minValue;
    }
    public int SearchMax(Array array) {
        int[] items = array.getItems();
        int maxValue = Integer.MIN_VALUE;
        int len = items.length;
        if (len == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < len; i++) {
            if (items[i] > maxValue) {
                maxValue = items[i];
            }
        }
        return maxValue;
    }

}
