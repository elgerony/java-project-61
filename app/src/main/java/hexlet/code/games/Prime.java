package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void checkPrime() {
        String chosenGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = randomQuestion();
        }
        Engine.gameProcess(chosenGame, rounds);
    }
    public static String[] randomQuestion() {
        int min = 1; // min number in game
        int max = 20; // max number in game
        int randomInt = new Random().nextInt(max - min) + min;
        String question = "" + randomInt;
        boolean isPrime = isPrime(randomInt);
        String correctAnswer = isPrime ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
