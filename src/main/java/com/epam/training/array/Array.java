package com.epam.training.array;

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
    //if (!super.equals(object)) return false;
    Array array = (Array) object;
    return java.util.Arrays.equals(items, array.items);
  }
  @Override
  public int hashCode() {
    //int result = super.hashCode();
    int result = 31 * 5 + java.util.Arrays.hashCode(items);
    return result;
  }

  @Override
  public String toString() {
    return "Array{" +
            "items=" + java.util.Arrays.toString(items) +
            '}';
  }
}
