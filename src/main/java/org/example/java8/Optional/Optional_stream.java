package org.example.java8.Optional;


import java.util.Optional;

public class Optional_stream {
    public static void main(String[] args) {

        Optional<Integer> op = Optional.of(9455);

        System.out.println("Optional: " + op);

        System.out.println("Getting the Stream:");
        op.stream().forEach(System.out::println);


    }
}