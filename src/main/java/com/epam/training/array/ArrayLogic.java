package com.epam.training.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

    //TODO: write it using binary search, findPrimeNumbers
    public boolean exists(Array array, int element) {
        ArraySorter arraySorter = new ArraySorter();
        arraySorter.sort(array);
        int lowIndex = 0;
        int[] itemExists = array.getItems();
        int highIndex = itemExists.length-1;

        while(lowIndex<= highIndex){

            int midIndex = (lowIndex + highIndex) / 2;
            if (element == itemExists[midIndex]) {
                return true;
            } else if (element < itemExists[midIndex]) {
                highIndex = midIndex-1;
            } else if (element > itemExists[midIndex]) {
                lowIndex = midIndex+1;
            }
        }
        return false;
    }

    public Array findPrimeNumbers(Array array) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        int[] primes = array.getItems();

        for (int prime : primes) {
            boolean isPrime = true;
            if (prime == 1) {
                isPrime = false;
            }
            for (int j = 2; j < prime; j++) {
                if (prime % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(prime);
            }
        }
        int size = primeNumbers.size();
        int[] resultOfPrimes = new int[size];

        for (int i = 0; i < size; i++) {
            resultOfPrimes[i] = primeNumbers.get(i);
        }
        return new Array (resultOfPrimes);
    }

    //TODO: add other methods here
    public void arrayMaxAndMinValues(Array array){
        System.out.println("Maximum array value: " + maxArrayValue(array) + " " + "Minimum array value: " + minArrayValue(array));
    }

    public int maxArrayValue(Array array) {
        int[] maxArray = array.getItems();
        int maxValue = maxArray[0];
        for (int j : maxArray) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue;
    }

    public int minArrayValue(Array array) {
        int[] minArray = array.getItems();
        int minValue = minArray[0];
        for (int j : minArray) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;
    }
}
