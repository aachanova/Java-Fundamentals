import java.util.Arrays;
import java.util.Scanner;

public class Ex07_1_Ex07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = arr.length - 1;

        while (length >= 1) {
            int[] second = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] += arr[i + 1];
            }

            second = Arrays.copyOf(arr, length);
            length--;
            arr = second;
        }

        System.out.println(arr[0]);
    }
}