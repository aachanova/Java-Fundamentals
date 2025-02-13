import java.util.Arrays;
import java.util.Scanner;

public class Ex01_1_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        String[] output = Arrays.stream(input)
                .filter(e -> e.length() >= 3 && e.length() <= 16)
                .filter(e -> isValidUsername(e))
                .toArray(String[]::new);

        for (String s : output) {
            System.out.println(s);
        }
    }

    private static boolean isValidUsername(String word) {
        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '-' && ch != '_') {
                return false;
            }
        }

        return true;
    }
}
