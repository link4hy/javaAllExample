package org.example.java8.Optional;


import java.util.Optional;

public class Optional_equals {
    public static void main(String[] args) {

        Optional<Integer> op1 = Optional.of(456);
        System.out.println("Optional 1: " + op1);

        Optional<Integer> op2 = Optional.of(456);
        System.out.println("Optional 2: " + op2);

        System.out.println("Comparing Optional 1" + " and Optional 2: "
                + op1.equals(op2));


        op1 = Optional.of(756);
        System.out.println("Optional 1: " + op1);

        op2 = Optional.empty();
        System.out.println("Optional 2: " + op2);

        System.out.println("Comparing Optional 1" + " and Optional 2: "
                + op1.equals(op2));
    }
}