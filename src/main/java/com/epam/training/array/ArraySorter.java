package com.epam.training.array;

public class ArraySorter {

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                int temp = 0;
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
    public static Array sortArr(Array array){
        int[] items = array.getItems();
        for (int i = 0; i < items.length; i++){
            for (int j = i + 1; j < items.length; j++){
                int temp = 0;
                if (items[i] > items[j]){
                    temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return new Array(items);
    }
}
