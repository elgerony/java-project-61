package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void checkEven() {
        String chosenGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = randomQuestion();
        }
        Engine.gameProcess(chosenGame, rounds);
    }
    public static String[] randomQuestion() {
        int min = 1; // min number in game
        int max = 100; // max number in game
        int randomInt = new Random().nextInt(max - min) + min;
        String question = "" + randomInt;
        String correctAnswer = randomInt % 2 == 0 ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }
}
