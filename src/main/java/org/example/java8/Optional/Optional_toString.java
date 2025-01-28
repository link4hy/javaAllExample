package org.example.java8.Optional;


import java.util.Optional;

public class Optional_toString {
    public static void main(String[] args) {

        Optional<Integer> op = Optional.of(452146);
        String value = op.toString();

        System.out.println("String Representation: " + value);


        op = Optional.empty();
        value = op.toString();

        System.out.println("String Representation: " + value);
    }
}