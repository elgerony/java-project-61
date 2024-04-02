package hexlet.code;
import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void checkEven() {

        var scanner = new Scanner(System.in);
        var scanAnswer = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int i = 0; // for counting games
        String message = "";
        while (i < 3) {

            int min = 1; // min number in game
            int max = 100; // max number in game
            var randomInt = new Random().nextInt(max - min) + min;
            System.out.print("Question: " + randomInt + "\n"); // question
            String userAnswer = scanAnswer.next();
            System.out.print("Your answer: " + userAnswer); // answer
            String correctAnswer = randomInt % 2 == 0 ? "yes" : "no"; // even check

            if (userAnswer.equals(correctAnswer)) { // message for correct answer
                message = "Correct!";
                System.out.println("\n" + message);
                i++;
                if (i == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            }
            else {  // message for wrong answer
                message = "Answer '" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.";
                System.out.println("\n" + message);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }


        }
    }
}
