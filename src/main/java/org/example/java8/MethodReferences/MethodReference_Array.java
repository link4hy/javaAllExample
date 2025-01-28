package org.example.java8.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class MethodReference_Array {
    // Method
    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        // Using method reference to print each name
        Arrays.stream(names).forEach(MethodReference_Array::print);


        Arrays.stream(names).forEach(i -> System.out.println(i));
    }
}