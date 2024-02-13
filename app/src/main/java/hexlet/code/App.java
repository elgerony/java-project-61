package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner choice = new Scanner(System.in);
        int choiceNum = choice.nextInt();
        System.out.println("Your choice: " + choiceNum + "\n");

        if (choiceNum == 1) {
            Cli.sayName();
        }
        if (choiceNum == 2) {
            Even.checkEven();
        }

    }

}
