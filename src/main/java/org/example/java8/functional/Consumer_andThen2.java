package org.example.java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Consumer_andThen2 {

    // Main driver method
    public static void main(String args[])
    {
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of integers
        Consumer<List<Integer> >
                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        try {
            // using addThen()
            modify.andThen(null).accept(list);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
