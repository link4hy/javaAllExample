package org.example.java8.functional;

import java.util.function.Function;


public class Function_identity {

    // Main driver method
    public static void main(String args[])
    {
        // Function which takes in a number and
        // returns it
        Function<Integer, Integer> i = Function.identity();

        // Print statement
        System.out.println(i.apply(10));
    }
}
