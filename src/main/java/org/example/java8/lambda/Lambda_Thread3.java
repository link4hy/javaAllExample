package org.example.java8.lambda;

import java.util.Random;

public class Lambda_Thread3 {
    static String[] games
            = { "COD", "Prince Of Persia", "GTA-V5",
            "Valorant", "FIFA 22", "Fortnite" };
    static String[] tracks
            = { "Believer", "Cradles", "Taki Taki", "Sorry",
            "Let Me Love You" };

    public static void main(String[] args)
    {
        RandomPlayer player
                = new RandomPlayer(); // Instance of
        Random random = new Random();
        Runnable gameRunner = () ->
        {
            try {
                player.playGame(games[random.nextInt(games.length)]); // Choosing game track
                // for playing
            }
            catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Runnable musicPlayer = () ->
        {
            try {
                player.playMusic(tracks[random.nextInt(tracks.length)]); // Choosing random
            }
            catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Thread game = new Thread(gameRunner);
        Thread music = new Thread(musicPlayer);

        game.start();
        music.start();
    }
}


class RandomPlayer {
    public void playGame(String gameName)
            throws InterruptedException
    {
        System.out.println(gameName + " game started");
        Thread.sleep(500); // this statement may throw
        System.out.println(gameName + " game ended");
    }

    public void playMusic(String trackName)
            throws InterruptedException
    {
        System.out.println(trackName + " track started");
        Thread.sleep(500); // this statement may throw
        System.out.println(trackName + " track ended");
    }
}

