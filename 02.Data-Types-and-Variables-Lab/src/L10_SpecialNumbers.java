import java.util.Scanner;

public class L10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i <= 9) {
                if (i == 5 || i == 7 || i == 11) {
                    System.out.printf("%d -> True%n", i);
                } else {
                    System.out.printf("%d -> False%n", i);
                }
            } else {
                int sum = 0;
                int number = i;
                while (number > 0) {
                    int lastDigit = number % 10;
                    sum += lastDigit;
                    number = number / 10;
                }

                if (sum == 5 || sum == 7 || sum == 11) {
                    System.out.printf("%d -> True%n", i);
                } else {
                    System.out.printf("%d -> False%n", i);
                }
            }
        }
    }
}
