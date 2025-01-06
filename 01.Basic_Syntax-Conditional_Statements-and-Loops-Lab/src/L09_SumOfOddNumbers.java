import java.util.Scanner;

public class L09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int number = 1;
        int sum = 0;

        while (counter < n) {
            if (number % 2 != 0) {
                System.out.println(number);
                counter++;
                sum += number;
            }
            number++;
        }

        System.out.printf("Sum: %d", sum);
    }
}
