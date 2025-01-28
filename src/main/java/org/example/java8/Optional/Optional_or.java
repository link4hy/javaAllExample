package org.example.java8.Optional;


import java.util.Optional;

public class Optional_or {
    public static void main(String[] args) {
        //op is not empty, return its value.
        Optional<Integer> op = Optional.of(9455);

        System.out.println("Optional: " + op);
        System.out.println("Optional by or(() ->" + " Optional.of(100)) method: " + op.or(() -> Optional.of(100)));

        //op is empty, return the orElse value.
        op = Optional.empty();
        System.out.println("Optional: " + op);

        try {
            System.out.println("Optional by or(() ->" + " Optional.of(100)) method: " + op.or(() -> Optional.of(100)));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}