package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
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
        if (choiceNum == 3) {
            Calc.calcGame();
        }
        if (choiceNum == 4) {
            GCD.GCDGame();
        }
        if (choiceNum == 5) {
            Progression.progressionGame();
        }
        if (choiceNum == 6) {
            Prime.checkPrime();
        }


    }

}
