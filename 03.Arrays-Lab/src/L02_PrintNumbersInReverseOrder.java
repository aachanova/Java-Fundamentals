import java.util.Arrays;
import java.util.Scanner;

public class L02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.printf("%d ", numbers[j]);
        }
    }
}
