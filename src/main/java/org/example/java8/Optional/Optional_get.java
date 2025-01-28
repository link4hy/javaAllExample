package org.example.java8.Optional;


import java.util.Optional;

public class Optional_get {
    public static void main(String[] args) {
        //op is not empty, return its value.
        Optional<Integer> op = Optional.of(9455);

        System.out.println("Optional: " + op);
        System.out.println("Value of this Optional: " + op.get());

        //op is empty, return the orElse value.
        op = Optional.empty();
        System.out.println("Optional: " + op);

        try {
            System.out.println("Value of this Optional: " + op.get());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}