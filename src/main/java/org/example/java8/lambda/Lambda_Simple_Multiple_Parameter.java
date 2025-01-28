package org.example.java8.lambda;

import java.util.ArrayList;

public class Lambda_Simple_Multiple_Parameter {
    public static void main(String[] args) {
        // Using lambda expressions to define the operations
        Functional add = (a, b) -> a + b;
        Functional multiply = (a, b) -> a * b;

        // Using the operations
        System.out.println(add.operation(6, 3));  // Output: 9
        System.out.println(multiply.operation(4, 5));  // Output: 20
    }
}

@FunctionalInterface
interface Functional {
    int operation(int a, int b);
}
