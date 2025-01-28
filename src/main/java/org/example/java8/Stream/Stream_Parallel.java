package org.example.java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_Parallel {
    public static void main(String[] args) {
        // create a list
        List<String> list = List.of("Hello ", "G", "E", "E", "K", "S!");


        //sequential stream
        list.stream().forEach(System.out::println);

        // using parallelStream()
        list.parallelStream().forEach(System.out::println);

        list.parallelStream().forEachOrdered(System.out::println);


    }

}
