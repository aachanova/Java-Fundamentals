import java.util.Arrays;
import java.util.Scanner;

public class Ex01_1_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        String[] output = Arrays.stream(input)
                .filter(e -> e.length() >= 3 && e.length() <= 16)
                .filter(e -> Character.isLetterOrDigit(e))
                .filter(e -> e.equals("-"))
                .filter(e -> e.equals("_"));

        for (String s : output) {
            System.out.println(s);
        }
    }
}
