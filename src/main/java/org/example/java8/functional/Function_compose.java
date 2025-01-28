package org.example.java8.functional;

import java.util.function.Function;


public class Function_compose {

    // Main driver method
    public static void main(String args[])
    {
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Triple the value given to half function
        half = half.compose(a -> 3 * a);

        // Applying the function to get the result
        System.out.println(half.apply(5));

        // Try block to check for exceptions
        try {

            // Trying to pass null as parameter
            half = half.compose(null);
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Print statement
            System.out.println("Exception thrown "
                    + "while passing null: "
                    + e);
        }

    }
}
