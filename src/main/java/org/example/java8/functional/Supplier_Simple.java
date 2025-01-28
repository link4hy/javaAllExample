package org.example.java8.functional;


import java.util.function.Supplier;


public class Supplier_Simple {

    // Main driver method
    public static void main(String args[])
    {
        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}
