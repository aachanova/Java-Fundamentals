import java.util.Scanner;

public class L09_1_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 1;

        for (int i = 0; i < n; i++) {
            if (number % 2 != 0) {
                sum += number;
                System.out.println(number++);
            } else {
                i--;
                number++;
            }
        }

        System.out.printf("Sum: %d", sum);
    }
}
