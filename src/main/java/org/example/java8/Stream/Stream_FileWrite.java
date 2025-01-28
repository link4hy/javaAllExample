package org.example.java8.Stream;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Stream_FileWrite {


    public static void main(String[] args) {

        String[] words = {"Geeks", "for", "Geeks", "Hello", "World"};
        String fileName = "./resources/file.txt";


        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {

            Stream.of(words).forEach(pw::println);

            System.out.println("Words written to the file successfully.");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
