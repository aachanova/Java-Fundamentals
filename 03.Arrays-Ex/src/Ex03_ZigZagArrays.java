import java.util.Scanner;

public class Ex03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int row = 0; row < n; row++) {
            String[] line = scanner.nextLine().split(" ");

            int firstElement = Integer.parseInt(line[0]);
            int secondElement = Integer.parseInt(line[1]);

            if (row % 2 == 0) {
                firstArr[row] = firstElement;
                secondArr[row] = secondElement;
            } else {
                firstArr[row] = secondElement;
                secondArr[row] = firstElement;
            }
        }

        for (int num1 : firstArr) {
            System.out.print(num1 + " ");
        }

        System.out.println();

        for (int num2 : secondArr) {
            System.out.print(num2 + " ");
        }
    }
}
