package org.example.java8.lambda;

public class Lambda_Simple_Multiple_Parameter2 {

    static void fun(Test3 t, Integer p1, Integer p2)
    {
        t.print(p1, p2);
    }
    public static void main(String[] args)
    {
        fun((p1, p2) -> System.out.println(p1 + " " + p2),
                10, 20);
    }
}

@FunctionalInterface
interface Test3 {
    void print(Integer p1, Integer p2);
}
