package org.example.java8.Optional;


import java.util.Optional;

public class Optional_empty {
    public static void main(String[] args) {

        String[] str = new String[5];

        str[2] = "Geeks Classes are coming soon";

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
    }
}