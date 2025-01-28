package org.example.java8.lambda;


public class Lambda_Simple_Single_Parameter2 {

    static void fun(Test2 t, Integer p)
    {
        t.print(p);
    }
    public static void main(String[] args)
    {
        fun(p -> System.out.println(p), 10);
    }
}

interface Test2 {
    void print(Integer p);
}
