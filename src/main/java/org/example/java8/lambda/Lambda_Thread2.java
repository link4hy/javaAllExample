package org.example.java8.lambda;

public class Lambda_Thread2 {
    public static void main(String[] args)
    {
        Runnable basic = () ->
        {

            String threadName
                    = Thread.currentThread().getName();
            System.out.println("Running common task by "
                    + threadName);
        };

        // Instantiating two thread classes
        Thread thread1 = new Thread(basic);
        Thread thread2 = new Thread(basic);

        // Running two threads for the same task
        thread1.start();
        thread2.start();
    }
}

