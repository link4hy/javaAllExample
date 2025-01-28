package org.example.java8.Optional;


import java.util.Optional;

public class Optional_orElseGet {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(9455);

        System.out.println("Optional: " + op);

        // orElseGet supplier
        System.out.println("Value by orElseGet" + "(Supplier) method: "
                + op.orElseGet(() -> (int) (Math.random() * 10)));


        op = Optional.empty();
        System.out.println("Optional: " + op);

        System.out.println("Value by orElseGet" + "(Supplier) method: "
                + op.orElseGet(() -> (int) (Math.random() * 1000)));
    }
}