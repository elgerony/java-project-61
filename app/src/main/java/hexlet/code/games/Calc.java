package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calcGame() {
        String chosenGame = "What is the result of the expression?";
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = randomQuestion();
        }
        Engine.gameProcess(chosenGame, rounds);
    }
    public static String[] randomQuestion() {
        int min = 1; // min number in game
        int max = 100; // max number in game
        int randomInt1 = new Random().nextInt(max - min) + min;
        int randomInt2 = new Random().nextInt(max - min) + min;
        char operator = randomOperator();
        char operatorWeGot;
        int result;
        switch (operator) {
            case '-' -> {
                operatorWeGot = '-';
                result = randomInt1 - randomInt2;
            }
            case '+' -> {
                operatorWeGot = '+';
                result = randomInt1 + randomInt2;
            }
            case '*' -> {
                operatorWeGot = '*';
                result = randomInt1 * randomInt2;
            }
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        String question = "Question: " + randomInt1 + " " + operatorWeGot + " " + randomInt2;
        String correctAnswer = String.valueOf(result);
        return new String[]{question, correctAnswer};
    }
    public static char randomOperator() {
        int min = 0;
        int max = 2;
        int randomOp = new Random().nextInt(max - min) + min;
        char[] operators = {'-', '+', '*'};
        return operators[randomOp];
    }


}
