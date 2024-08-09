package encoder;

import java.util.Base64;
import java.util.Scanner;

public class Encode {
    public static void main(String[] args) {

        String menu = """
                1. - Encode a String to Base64
                2. - Decode a String to Base64
                """;
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        String secretString,
                result;

        System.out.println(menu);
        userChoice = scanner.nextInt();
        // Consume the leftover newline character
        scanner.nextLine();

        switch (userChoice) {
            case 1:
                System.out.println("Plese enter the string to encode");
                secretString = scanner.nextLine();
                Base64.Encoder encoder = Base64.getEncoder();
                result = encoder.encodeToString(secretString.getBytes());
                System.out.println("Encoded String is: " + result);
                break;
            case 2:
                System.out.println("Plese enter the string to decode");
                secretString = scanner.nextLine();
                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decodedBytes = decoder.decode(secretString);
                result = new String(decodedBytes);
                System.out.println("Decoded String is: " + result);

            default:
                break;
        }

        scanner.close();

    }
}
