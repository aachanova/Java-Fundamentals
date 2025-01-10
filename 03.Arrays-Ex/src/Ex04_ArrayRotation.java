import java.util.Arrays;
import java.util.Scanner;

public class Ex04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        if (rotations >= arr.length) {
            rotations = rotations % arr.length;
        }

        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
