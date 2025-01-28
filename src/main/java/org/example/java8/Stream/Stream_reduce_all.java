package org.example.java8.Stream;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_reduce_all {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result2 = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
        System.out.println(result2);

        result2 = letters
                .stream()
                .reduce(
                        "", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
        System.out.println(result2);


        // String
        List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

        Optional<String> longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);

        longestString.ifPresent(System.out::println);
    }

}
