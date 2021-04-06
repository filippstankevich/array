package com.epam.training.array;

import java.util.Arrays;
import java.util.Collection;

//TODO: write a wrapper class for a java int array, make this class immutable
public class  Array {
    private final int[] items; //why int and not Integer if its a wrapper class?

  public Array(int[] items) {
    this.items = items;
  }
  public int[] getItems() {
    return Arrays(items, items.length);
  }
  public void setItems(int[] items) {
   // this.items = items; instead of using setters, make it immutable. leave it empty?
  }
  @Override
  public int hashCode() {
    return Arrays.hashCode(items);
    //returns a hash code based on the contents of the specified array
  }
  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;
    if(obj == null || obj.getClass()!= this.getClass())
      return false;
    Array array = (Array) obj;
  //redefines "equality" of objects. an object is equal to another object only if it is the same instance.
    //But you can provide custom equality logic when you override it. Classes need to test for equality.
  }
  @Override
  public String toString() {
   // return super.toString();
  }

}
