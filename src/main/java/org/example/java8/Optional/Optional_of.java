package org.example.java8.Optional;


import java.util.Optional;

public class Optional_of {
    public static void main(String[] args) {
        // create a Optional
        Optional<Integer> op = Optional.of(9455);

        System.out.println("Optional: " + op);

        try {
            op = Optional.of(null);

            // print value
            System.out.println("Optional: " + op);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}