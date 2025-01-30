package org.example.java.serviceLoad;

/**
 * https://dzone.com/articles/play-with-java-serviceloader-forget-about-dependen
 * make sure u have com.knoldus.service.GreetingsService under META-INF/service on classpath
 */
public class Launcher {
    public static void main(String... args) {
        GreetingsService service = GreetingsProvider.getInstance().serviceImpl();
        service.sayHello("Knoldus");
    }
}
