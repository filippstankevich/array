package com.epam.training.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayLogic {

    //TODO: write it using binary search
    public boolean exists(Array array) {
        throw new UnsupportedOperationException();
    }


    public Array findPrimeNumbers(Array array) {
        throw new UnsupportedOperationException();
    }

    //TODO: add other methods here

    public void SortArray() {
        int[] anArray = new int[100];
        for (int i = 0; i < anArray.length; i++) {
            // Random number
            anArray[i] = new Random().nextInt(100);
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
        /* Sorted */
        Arrays.sort(anArray);
        for (int elemets : anArray) {
            System.out.print(elemets + " ");
        }
    }

    public void Saerche() {
        int[] anArray = new int[50];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
        }
        System.out.println("Min value " + anArray[0]);
        System.out.println("Max value " + anArray[anArray.length - 1]);
    }

    public void PrimeNumber() {
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
    }
}

