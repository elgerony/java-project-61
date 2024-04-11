package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCD {
    private static final int MAX_INT = 100;
    public static void GCDGame() {
        String chosenGame = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = randomQuestion();
        }
        Engine.gameProcess(chosenGame, rounds);
    }
    public static String[] randomQuestion() {
        int min = 1; // min number in game
        int randomInt1 = Utils.generateRandom(min, MAX_INT);
        int randomInt2 = Utils.generateRandom(min, MAX_INT);
        int resultGSD = gcd(randomInt1, randomInt2);
        String question = randomInt1 + " " + randomInt2;
        String correctAnswer = String.valueOf(resultGSD);
        return new String[]{question, correctAnswer};
    }
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

}
