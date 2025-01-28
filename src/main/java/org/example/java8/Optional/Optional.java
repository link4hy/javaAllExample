package org.example.java8.Optional;


public class Optional {
    public static void main(String[] args) {
        String[] str = new String[10];

        // Uncomment this line to test with a non-null value.
        str[5] = "Hello, Optional!";

        // Create an Optional object from the value of str[5].
        java.util.Optional<String> checkNull = java.util.Optional.ofNullable(str[5]);

        // Check if the Optional object contains a value.
        if (checkNull.isPresent()) {
            // Convert the string to lowercase if it's not null.
            String word = str[5].toLowerCase();
            System.out.println(word); // Print the lowercase string.
        } else {
            System.out.println("string is null"); // Indicate that the string is null.
        }
    }
}