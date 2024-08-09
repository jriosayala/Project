import java.util.Scanner;

import calculator.Calculator;
import encoder.Encode;

public class App {
    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        int userChoice;
        System.out.println("""
                Please chose an option:
                1. - Basic calculator
                2. - Encoder
                3. - Student average calculator
                """);

        userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                Calculator.main(args);
                break;
            case 2:
                Encode.main(args);
                break;

            default:
                break;
        }
        scanner.close();
    }
}
