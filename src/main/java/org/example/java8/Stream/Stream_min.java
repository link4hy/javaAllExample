
package org.example.java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_min {
    public static void main(String[] args) {

        var alex = new Person("Alex", 23);
        var john = new Person("John", 40);
        var peter = new Person("Peter", 32);
        var peopleList = Arrays.asList(alex, john, peter);

        Person minByAge = peopleList
                .stream()
                .min(Comparator.comparing(Person::getAge))
                .get();

        System.out.println(minByAge.age + ":" + minByAge.name);
    }

}


class Person {
    String name;
    Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Integer getAge() {
        return this.age;
    }
}
