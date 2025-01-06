import java.util.Scanner;

public class Ex06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int initialNumber = number;
        int sum = 0;

        while (number > 0) {
            int currentDigit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= currentDigit; i++) {
                factorial = factorial * i;
            }

            sum += factorial;
            number = number / 10;
        }

        if (initialNumber == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
