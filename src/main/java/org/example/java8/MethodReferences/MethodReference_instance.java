package org.example.java8.MethodReferences;

public class MethodReference_instance {
    public void runMethod() {
        System.out.println("Thread running...");
    }

    public static void main(String[] args) {
        Runnable r = new MethodReference_instance()::runMethod;
        Thread t1 = new Thread(r);
        t1.start();
    }
}