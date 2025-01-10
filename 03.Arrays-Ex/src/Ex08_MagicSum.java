import java.util.Arrays;
import java.util.Scanner;

public class Ex08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];

                if (first + second == sum) {
                    System.out.printf("%d %d%n", first, second);
                }
            }
        }
    }
}
