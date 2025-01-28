package org.example.java8.lambda;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lambda_ArrayListToHashMap {
    public static void main(String[] args) {
        List<ListItems> list = new ArrayList<ListItems>();

        list.add(new ListItems(1, "I"));
        list.add(new ListItems(2, "Love"));
        list.add(new ListItems(3, "Geeks"));
        list.add(new ListItems(4, "For"));
        list.add(new ListItems(5, "Geeks"));

        Map<Integer, String> map = new HashMap<>();

        list.forEach(
                (n) -> {
                    map.put(n.getkey(), n.getvalue());
                });

        System.out.println("Map : " + map);
    }
}

class ListItems {
    private Integer key;
    private String value;

    public ListItems(Integer id, String name) {
        this.key = id;
        this.value = name;
    }

    public Integer getkey() {
        return key;
    }

    public String getvalue() {
        return value;
    }
}