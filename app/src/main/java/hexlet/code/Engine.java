package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static void gameProcess(String chosenGame, String[][] rounds) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(chosenGame);

        for (String[] round : rounds) {
            System.out.print("Question: " + round[0] + "\n");
            System.out.print("Your answer: ");
            String usersAnswer = scanner.next();
            if (round[1].equals(usersAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + usersAnswer + "' is a wrong answer ;(. Correct answer was '" + round[1] + "'.\n");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
