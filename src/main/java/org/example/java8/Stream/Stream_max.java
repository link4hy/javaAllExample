package org.example.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_max {
    // Main driver method
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
        Integer expectedResult = 89;


        //Type1
        Integer max = listOfIntegers
                .stream()
                .mapToInt(v -> v)
                .max().getAsInt();
        System.out.println(max);

        //Type2
        Integer max2 = listOfIntegers
                .stream().max(Integer::compare).get();
        System.out.println(max2);

        //Type3
        Integer max3 = listOfIntegers
                .stream().max((x, y) -> (x < y) ? -1 : ((x == y) ? 0 : 1)).get();
        System.out.println(max3);




    }

}
