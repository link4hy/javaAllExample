package org.example.java8.Optional;

import java.util.Optional;

public class Optional_ifPresentOrElse {
    public static void main(String[] args) {

        //op is not empty.
        Optional<Integer> op = Optional.of(9455);
        System.out.println("Optional: " + op);

        op.ifPresentOrElse(
                (value) -> System.out.println("Value is present, its: " + value),

                () -> System.out.println("Value is empty")
        );

        //op is empty.
        op = Optional.empty();
        System.out.println("Optional: " + op);

        op.ifPresentOrElse(
                (value) -> System.out.println("Value is present, its: " + value),

                () -> System.out.println("Value is empty")
        );

    }
}