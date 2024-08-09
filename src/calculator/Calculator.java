package calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int userChoice;
        float a,
                b,
                result = 0.0f;
        final DecimalFormat df = new DecimalFormat("#.##");

        final String menu = """
                Please chose an option
                1. - Sum (a + b)
                2. - Substract (a - b)
                3. - Multiply (a x b)
                4. - Divide (a / b)
                    """;
        System.out.println(menu);

        userChoice = scanner.nextInt();
        System.out.println("Please enter the value for a: ");
        a = scanner.nextFloat();

        System.out.println("Please enter the value for b: ");
        b = scanner.nextFloat();

        switch (userChoice) {
            case 1:
                result = sum(a, b);
                break;
            case 2:
                result = substraction(a, b);
                break;
            case 3:
                result = multiplication(a, b);
                break;
            case 4:
                result = division(a, b);
                break;
            default:
                break;
        }
        System.out.println("The result is: " + df.format(result));
        scanner.close();
    }

    public static float sum(final float a, final float b) {
        return a + b;
    }

    public static float substraction(final float a, final float b) {
        return a - b;
    }

    public static float multiplication(final float a, final float b) {
        return a * b;
    }

    public static float division(final float a, final float b) {
        return a / b;
    }
}
