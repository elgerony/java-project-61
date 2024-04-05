package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
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
        var temp = randomTemp();
        var startInt = new Random().nextInt(maxInt - minInt) + minInt;
        var firstInt = startInt;
        var numbers = new String[10];
        numbers[0] = String.valueOf(firstInt);
        for (int i = 1; i < numbers.length; i++ ) {
            numbers[i] = String.valueOf(firstInt + temp);
            firstInt = Integer.valueOf(numbers[i]);
        }
        var randomPlace = randomPlace();
        numbers[randomPlace] = "..";
        String progression = "";
        for (int i = 0; i < numbers.length; i++ ) {
            progression += numbers[i] + " ";
        }
        var trimedProgression = progression.trim();
        var correctAnswer = String.valueOf(startInt + temp * randomPlace);
        var question = trimedProgression + ".";
        return new String[]{question, correctAnswer};
    }
    public static int randomTemp() {
        int minTemp = 1;
        int maxTemp = 5;
        return new Random().nextInt(maxTemp - minTemp) + minTemp;
    }
    public static int randomPlace() {
        int min = 0;
        int max = 9;
        return new Random().nextInt(max - min) + min;
    }
}
