package org.example.java8.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_FileRead {

    private static List<String> filterAndConvertToUpper(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() == length)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        String fileName = "./resources/file.txt";

        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {

            List<String> filteredStrings = filterAndConvertToUpper(lines, 5);
            System.out.println("Filtered strings with length 5 (converted to uppercase): " + filteredStrings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
