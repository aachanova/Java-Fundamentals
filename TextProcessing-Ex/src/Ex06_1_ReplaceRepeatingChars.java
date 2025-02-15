import java.util.Scanner;

public class Ex06_1_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder("" + input.charAt(0));

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                output.append(input.charAt(i + 1));
            }
        }

        System.out.println(output);
    }
}




