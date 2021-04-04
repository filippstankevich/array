package com.epam.training.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLogic {

    public static boolean exists(Array array,int element) {
        Array sortedArray = ArraySorter.sort(array);
        int result = Arrays.binarySearch(sortedArray.getItems(),element);
        if (result >= 0){
            return  true;
        }
        else{
            return false;
        }
    }

    public static int max(Array array){
        int items[] = array.getItems();

        List<Integer> intList = new ArrayList<Integer>(items.length);
        for (int i : items)
        {
            intList.add(i);
        }

        final int max = Collections.max(intList);
        return max;
    }

    public static int min(Array array){
        int items[] = array.getItems();

        List<Integer> intList = new ArrayList<Integer>(items.length);
        for (int i : items)
        {
            intList.add(i);
        }

        final int min = Collections.min(intList);
        return min;
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Array findPrimeNumbers(Array array) {
        List<Integer> primeList = new ArrayList<>();

        int[] items = array.getItems();
        for (int element: items) {
            if (isPrimeNumber(element)){
                primeList.add(element);
            }
        }

        int[] ar = new int[primeList.size()];

        for (int i = 0; i < primeList.size(); i++){
            ar[i] = primeList.get(i);
        }

        Array result = new Array(ar);
        return result;
    }



}
