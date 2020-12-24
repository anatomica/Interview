package Homework_3;

public class PingPong {

    private PingPongThread player1 = new PingPongThread("Ping");
    private PingPongThread player2 = new PingPongThread("Pong");

    PingPong() {
        Ball ball = Ball.getBall();
    }

    void startGame() throws InterruptedException {
        player1.start();
        player2.start();
    }
}
