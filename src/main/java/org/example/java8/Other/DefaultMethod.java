/**
 * Before Java 8, interfaces could only have abstract methods. The implementation of these methods has to be provided in a separate class.
 * So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface.
 * To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation
 * without affecting the classes that implement the interface.
 */

package org.example.java8.Other;

public class DefaultMethod implements TestInterface {


    @Override
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        var d = new DefaultMethod();
        d.square(4);

        d.show();
    }
}


interface TestInterface {
    public void square(int a);

    default void show() {
        System.out.println("Default Method Executed");
    }
}
