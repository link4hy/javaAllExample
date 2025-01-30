package org.example.java.serviceLoad;

public class ConsoleGreetings implements GreetingsService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello to " + name);
    }
}