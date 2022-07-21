import java.security.SecureRandom;

public class RollDie {
    private static final SecureRandom num = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}


    private static final int SNAKE_EYE = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CAR = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDices = rollDice();

        switch (sumOfDices) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYE, TREY, BOX_CAR -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDices;
                System.out.printf("Point is %d\n", myPoint);
            }
        }
        while (gameStatus == Status.CONTINUE) {
            sumOfDices = rollDice();

            if (sumOfDices == myPoint) {
                gameStatus = Status.WON;
            } else {
                if (sumOfDices == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }
        if (gameStatus == Status.WON) {
            System.out.println("--------------------------");
            System.out.println("Player wins");
            System.out.println("--------------------------");
        } else {
            System.out.println("--------------------------");
            System.out.println("Player loses");
            System.out.println("--------------------------");
        }
    }

    private static int rollDice() {
        int die1 = 1 + num.nextInt(6);
        int die2 = 1 + num.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
        return sum;
    }
}
