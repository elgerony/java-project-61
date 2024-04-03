package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
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
        int max = 100; // max number in game
        int randomInt1 = new Random().nextInt(max - min) + min;
        int randomInt2 = new Random().nextInt(max - min) + min;
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
