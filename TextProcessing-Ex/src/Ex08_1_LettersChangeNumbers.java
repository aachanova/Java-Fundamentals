import java.util.Scanner;

public class Ex08_1_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;

        for (String str : input) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            double number = Double.parseDouble(str.substring(1 , str.length() - 1));

            sum += Character.isUpperCase(first) ? number / getPosition(first) : number * getPosition(first);
            sum += Character.isUpperCase(last) ? -getPosition(last) : getPosition(last);
        }

        System.out.printf("%.2f", sum);
    }

    private static int getPosition(char letter) {
        return Character.toUpperCase(letter) - '@';
    }
}
