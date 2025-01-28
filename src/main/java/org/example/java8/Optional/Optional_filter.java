package org.example.java8.Optional;


import java.util.Optional;

public class Optional_filter {
    public static void main(String[] args) {
        //op is not empty
        Optional<Integer> op = Optional.of(9456);

        System.out.println("Optional: " + op);
        System.out.println("Filtered value " + "for odd or even: "
                + op.filter(num -> num % 2 == 0));

        //op is empty
        op = Optional.empty();
        System.out.println("Optional: " + op);

        try {

            System.out.println("Filtered value " + "for odd or even: "
                    + op.filter(num -> num % 2 == 0));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}