package com.epam.training.array;

public class ArrayLogic {

    public static int binarySearch(int[] array, int key){
        int begin = 0;
        int end = array.length;
        while (true) {
            int middle = (begin + end) / 2;
            if (array[middle] == key) {
                return middle;
            }
            if (array[middle] > key) {
               end = middle;
            }
            if (array[middle] < key) {
                begin = middle;
            }
            if (end == begin + 1){
                if (array[end] == key) {
                    return end;
                } else if (array[begin] == key) {
                    return begin;
                } else {
                    return -1;
                }
            }
        }
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
