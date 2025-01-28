package org.example.java8.Optional;


import java.util.Optional;

public class Optional_hashCode {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(456);

        System.out.println("Optional: " + op);
        System.out.println("Optional hashCode value: " + op.hashCode());


        op = Optional.empty();

        System.out.println("Optional: " + op);
        System.out.println("Optional hashCode value: " + op.hashCode());


        Optional<String> op2 = Optional.of("456");

        System.out.println("Optional: " + op2);
        System.out.println("Optional hashCode value: " + op2.hashCode());


    }
}