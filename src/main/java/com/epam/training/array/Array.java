package com.epam.training.array;

import java.util.Arrays;

//TODO: write a wrapper class for a java int array, make this class immutable
//implementing immutable object according to: https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
public final class Array {
  
  private final int[] items;

  public Array(int[] items) {

    //Don't share references to the mutable objects. Never store references to external,
    // mutable objects passed to the constructor;
    // if necessary, create copies, and store references to the copies.

    // Similarly, create copies of your internal mutable objects when necessary
    // to avoid returning the originals in your methods.
    if (items == null){
      this.items = null;
    }
    else{
      this.items = items.clone();
    }


  }

  public int[] getItems() {

    // Similarly, create copies of your internal mutable objects when necessary
    // to avoid returning the originals in your methods.
    if (items == null){
      return null;
    }
    return items.clone();
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
