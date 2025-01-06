import java.util.Scanner;

public class L13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        // The following should be refactored:
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        int sum = 1;
//        for (int i = 0; i <= n; i++) {
//            System.out.print(2 * i + 1);
//            sum += 2 * i;
//        }
//        System.out.printf("Sum: %d%n", sum);

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(2 * i + 1);
            sum += 2 * i + 1;
            System.out.println();
        }
        System.out.printf("Sum: %d", sum - 1);
    }
}
