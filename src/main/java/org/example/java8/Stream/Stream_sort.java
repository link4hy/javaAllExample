package org.example.java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sort {
    // Main driver method
    public static void main(String[] args) {

        List<String> companyList = new ArrayList<>();

        companyList.add("Google");
        companyList.add("Apple");
        companyList.add("Microsoft");


        companyList.stream().sorted().forEach(
                System.out::println);
    }

}
