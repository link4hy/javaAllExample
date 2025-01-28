package org.example.java8.Optional;


import java.util.Optional;

public class Optional_isPresent {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(9455);

        System.out.println("Optional: " + op);
        System.out.println("Is any value present: " + op.isPresent());


        op = Optional.empty();

        System.out.println("Optional: " + op);
        try {

            System.out.println("Is any value present: " + op.isPresent());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}