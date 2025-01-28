package org.example.java8.Optional;


import java.util.Optional;

public class Optional_orElseThrow {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(9455);

        System.out.println("Optional: " + op);

        System.out.println("Value by orElseThrow(" + "ArithmeticException::new) method: "
                + op.orElseThrow(ArithmeticException::new));

        op = Optional.empty();

        System.out.println("Optional: " + op);

        try {
            System.out.println("Value by orElseThrow(" + "ArithmeticException::new) method: "
                    + op.orElseThrow(ArithmeticException::new));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}