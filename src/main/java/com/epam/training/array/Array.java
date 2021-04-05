package com.epam.training.array;

import java.util.Arrays;
import java.util.Collection;

//TODO: write a wrapper class for a java int array, make this class immutable
public class  Array {
    private final Integer[] items;

  public Array(Integer[] items) {
    this.items = items;
  }
  public Integer[] getItems() {
    return Arrays.copyOf(items, items.length);
  }
  public void setItems(Integer[] items) {
   // this.items = items;
  }
  @Override
  public int hashCode() {
    return super.hashCode();
  }
  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
  @Override
  public String toString() {
    return super.toString();
  }

}
