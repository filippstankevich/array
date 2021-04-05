package com.epam.training.array;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sorted");
        ArrayLogic sort = new ArrayLogic();
        sort.SortArray();
        System.out.println("\nSorted END");

        System.out.println("Search min, max");
        ArrayLogic Searche = new ArrayLogic();
        Searche.Saerche();
        System.out.print("Search min, max END");

        System.out.println("Prime Number");
        ArrayLogic primeNumber = new ArrayLogic();
        primeNumber.PrimeNumber();
        System.out.print("\nPrime Number");

        System.out.println("Fibonacci");
        Fibonacci fibi = new Fibonacci();
        fibi.Fibonaci();
        System.out.println("\nFibonacci END");
    }
}
