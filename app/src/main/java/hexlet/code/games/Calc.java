package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


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
        int randomInt1 = Utils.generateRandom(min, max);
        int randomInt2 = Utils.generateRandom(min, max);;
        char operator = randomOperator();
        var result = calculate(randomInt1, randomInt2, operator);
        String correctAnswer = String.valueOf(result);
        String question = "Question: " + randomInt1 + " " + operator + " " + randomInt2;
        return new String[]{question, correctAnswer};
    }
    public static char randomOperator() {
        int min = 0;
        int max = 2;
        int randomOp = Utils.generateRandom(min, max);
        char[] operators = {'-', '+', '*'};
        return operators[randomOp];
    }

    private static int calculate(int randomInt1, int randomInt2, char operator) {
        return switch (operator) {
            case '-' -> randomInt1 - randomInt2;
            case '+' -> randomInt1 + randomInt2;
            case '*' -> randomInt1 * randomInt2;
            default -> throw new IllegalStateException("Unexpected value!");
        };
    }
}
