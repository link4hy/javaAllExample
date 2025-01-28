package org.example.java8.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Person {
    void greet() {
        System.out.println("Hello, World!");
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person(), new Person());

        // Lambda expression
        Consumer<Person> lambda = person -> person.greet();

        // Instance method reference
        Consumer<Person> reference = Person::greet;

        people.forEach(reference);
    }
}