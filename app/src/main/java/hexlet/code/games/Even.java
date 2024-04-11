package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void checkEven() {
        String chosenGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = randomQuestion();
        }
        Engine.gameProcess(chosenGame, rounds);
    }
    public static String[] randomQuestion() {
        int min = 1; // min number in game
        int max = 100; // max number in game
        int randomInt = Utils.generateRandom(min, max);
        String question = "" + randomInt;
        String correctAnswer = String.valueOf(isEven(randomInt));
        return new String[]{question, correctAnswer};
    }
    public static String isEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
}
