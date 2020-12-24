package Homework_3;

public class Ball {
    private int kicks = 0;
    private static Ball instance = new Ball();
    private String side = "";

    private Ball() {
    }

    static Ball getBall() {
        return instance;
    }

    synchronized void kickBall(String playerName) {
        kicks++;
        side = playerName;
        System.out.println(kicks + " " + side);
    }

    String getSide() {
        return side;
    }

    boolean isInGame() {
        return (kicks < 15);
    }
}
