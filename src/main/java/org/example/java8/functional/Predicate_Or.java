package org.example.java8.functional;


import java.util.function.Predicate;


public class Predicate_Or {
    public static Predicate<String> hasLengthOf10 = t -> t.length() > 10;


    public static Predicate<String> containsB = t -> t.contains("B");

    public static void predicate_or()
    {

        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).or(containsB).test(containsA);
        System.out.println(outcome);
    }
    public static void main(String[] args)
    {
        predicate_or();
    }
}
