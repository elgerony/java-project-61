package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void getName() {
        var scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();

    }
}

