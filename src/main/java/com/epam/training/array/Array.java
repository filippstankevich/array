package com.epam.training.array;

import java.util.Arrays;

//TODO: write a wrapper class for a java int array, make this class immutable
public class Array {
  
  private int[] items;

  public Array(int[] items) {
    this.items = items;
  }

  public int[] getItems() {
    return items;
  }

  public void setItems(int[] items) {
    this.items = items;
  }
  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Array array = (Array) object;
    return Arrays.equals(items, array.items);
  }
  @Override
  public int hashCode() {
    int result = 31 * 5 + Arrays.hashCode(items);
    return result;  }

  @Override
  public String toString() {
    return "Array{" +
            "items=" + Arrays.toString(items) +
            '}';
  }
}
