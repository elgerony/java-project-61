package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final int LENGTH = 10;
    public static void progressionGame() {
        String chosenGame = "What number is missing in the progression?";
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = randomQuestion();
        }
        Engine.gameProcess(chosenGame, rounds);
    }
    public static String[] randomQuestion() {
        int minInt = 5;
        int maxInt = 30;
        var startInt = Utils.generateRandom(minInt, maxInt);
        var temp = randomTemp();
        var randomPlace = randomPlace();
        var result = randomProgression(startInt, temp, randomPlace);
        var correctAnswer = String.valueOf(startInt + temp * randomPlace);
        var question = result + ".";
        return new String[]{question, correctAnswer};
    }
    public static int randomTemp() {
        int minTemp = 1;
        int maxTemp = 5;
        var result = Utils.generateRandom(minTemp, maxTemp);
        return result;
    }
    public static int randomPlace() {
        int min = 0;
        int max = LENGTH - 1;
        var result = Utils.generateRandom(min, max);
        return result;
    }

    public static String randomProgression(int startInt, int temp, int randomPlace) {
        var firstInt = startInt;
        var numbers = new String[LENGTH];
        numbers[0] = String.valueOf(firstInt);
        for (int i = 1; i < numbers.length; i++ ) {
            numbers[i] = String.valueOf(firstInt + temp);
            firstInt = Integer.valueOf(numbers[i]);
        }
        numbers[randomPlace] = "..";
        String progression = "";
        for (int i = 0; i < numbers.length; i++ ) {
            progression += numbers[i] + " ";
        }
        var trimedProgression = progression.trim();
        return trimedProgression;
    }
}
