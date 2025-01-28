package org.example.java8.lambda;

public class Lambda_Simple_block {
    public static void main(String[] args) {

        New leapyr = (year) ->
        {
            if (((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)))
                return true;
            else
                return false;
        };
        if (leapyr.test(2020))
            System.out.println("leap year");
        else
            System.out.println("Non leap year");
    }
}

@FunctionalInterface
interface New {
    boolean test(int n);
}