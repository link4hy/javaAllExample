package org.example.java8.Other;

import java.util.List;
import java.util.function.ObjLongConsumer;

public class ObjLongConsumer_ {

    public static void main(String args[]) {

        List<Integer> arr = List.of(3, 2, 5, 7, 4);

        ObjLongConsumer<List<Integer>> func = (list, num) ->
        {
            list.forEach(a -> System.out.println(a * num));
        };
        func.accept(arr, 200000);
    }
}
