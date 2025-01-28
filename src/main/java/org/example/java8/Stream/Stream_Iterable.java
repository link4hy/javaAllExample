package org.example.java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Stream_Iterable {
    // Main driver method
    public static void main(String[] args) {

        Iterable<Integer> iterable = List.of(1, 2, 3, 4, 5);

        Stream<Integer> stream = getStreamFromIterable(iterable);

        stream.forEach(s -> System.out.println(s));
    }

    public static <T> Stream<T>
    getStreamFromIterable(Iterable<T> iterable) {

        Spliterator<T> spliterator = iterable.spliterator();

        return StreamSupport.stream(spliterator, false);
    }

}
