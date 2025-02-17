import java.util.Arrays;
import java.util.Scanner;

public class Ex07_1_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder(input);
        int numForDel = 0;

        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == '>') {
                numForDel += Character.getNumericValue(output.charAt(i + 1));
            } else if (numForDel > 0) {
                output.deleteCharAt(i);
                numForDel--;
                i--;
            }
        }

        System.out.println(output);
    }
}
