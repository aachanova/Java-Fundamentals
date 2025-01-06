import java.util.Scanner;

public class L09_2_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int oddNum = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(oddNum);
            sum += oddNum;
            oddNum += 2;
        }

        System.out.printf("Sum: %d", sum);
    }
}
