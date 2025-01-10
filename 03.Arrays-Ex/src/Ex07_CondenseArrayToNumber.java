import java.util.Arrays;
import java.util.Scanner;

public class Ex07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = arr.length - 1;

        while (length >= 1) {
            for (int i = 0; i < length; i++) {
                arr[i] = arr[i] + arr[i + 1];
            }

            length--;
        }

        System.out.println(arr[0]);
    }
}
