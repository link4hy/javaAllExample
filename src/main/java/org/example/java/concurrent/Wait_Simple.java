package org.example.java.concurrent;

public class Wait_Simple {

    public static void main(String[] args) {

        Object lock = new Object();

        Runnable r1 = () -> {
            System.out.println("started Thread1");

            try {
                synchronized (lock) {
                    lock.wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End Thread1");
        };

        Runnable r2 = () -> {
            System.out.println("started Thread2");
            synchronized (lock) {

                lock.notifyAll();
            }
        };
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);


        thread1.start();

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.start();
    }
}
