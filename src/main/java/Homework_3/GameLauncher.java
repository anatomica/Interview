package Homework_3;

public class GameLauncher {

    public static void main(String[] args) throws InterruptedException {

        PingPong game = new PingPong();
        game.startGame();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        counter1.start();
        counter2.start();
        counter3.start();
    }
}
