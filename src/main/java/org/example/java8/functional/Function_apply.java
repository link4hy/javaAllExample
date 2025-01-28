package org.example.java8.functional;

import java.util.function.Function;


public class Function_apply {

    // Main driver method
    public static void main(String args[])
    {
        // Function which takes in a number
        // and returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Applying the function to get the result
        System.out.println(half.apply(10));
    }
}
