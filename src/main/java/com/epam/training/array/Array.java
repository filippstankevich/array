package com.epam.training.array;
import java.util.Arrays;
//TODO: write a wrapper class for a java int array, make this class immutable
public final class Array {
    public Array(int len) {
        items = new int[len];
    }
    public Array (int len, int value) {
        items = new int[len];
        for (int i = 0; i < len; i++) {
            items[i] = value;
        }
    }
    public Array (int[] array) {
        items = array;
    }
    public int[] getItems(){
        return items.clone();
    }
    @Override
    public String toString(){
        String str = Arrays.toString(items);
        return str;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Array)) {
            return false;
        }
        Array arr = (Array) obj;
        if (Arrays.equals(arr.items, items)) {
            return true;
        } else 
            return false;
    }
    @Override       
    public int hashCode() {
        return Arrays.hashCode(items);
    }
    private int[] items;

}
