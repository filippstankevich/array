package com.epam.training.array;

import java.util.Arrays;

//TODO: write a wrapper class for a java int array, make this class immutable
public class Array {

  private final int[] items;

  public Array(int[] items) {
    this.items = items;
  }

  public int[] getItems() {
    return items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Array array = (Array) o;
    return Arrays.equals(items, array.items);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(items);
  }

  @Override
  public String toString() {
    return "Array{" +
            "items=" + Arrays.toString(items) +
            '}';
  }

}
