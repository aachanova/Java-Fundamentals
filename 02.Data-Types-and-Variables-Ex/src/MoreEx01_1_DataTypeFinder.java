import java.util.Scanner;

public class MoreEx01_1_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (isInteger(input)) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble(input)) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }

            input = scanner.nextLine();
        }
    }

    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

