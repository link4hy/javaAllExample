/**
 * The try-with-resources statement is a try statement that declares one or more resources.
 * A resource is an object that must be closed after the program is finished with it.
 * The try-with-resources statement ensures that each resource is closed at the end of the statement.
 * Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.
 */


package org.example.java7.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        String fileName = "./resources/file.txt";

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
