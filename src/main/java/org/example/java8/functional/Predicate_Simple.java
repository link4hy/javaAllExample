package org.example.java8.functional;


import java.util.function.Predicate;


public class Predicate_Simple {

    // Main driver method
    public static void main(String args[])
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));
    }
}
