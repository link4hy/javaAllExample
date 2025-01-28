package org.example.java16.recordClass;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John Doe", "100 Linda Ln.");
        System.out.println(person);

        String name = "John Doe";
        String address = "100 Linda Ln.";

        System.out.println(person.name);
        System.out.println(person.address);

        Person person2 = new Person(name, address);

        System.out.println(person.equals(person2));
    }


    public record Person(String name, String address) {
    }

}