import java.util.Arrays;
import java.util.Scanner;

public class Ex05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isTopInteger = true;
            int currentNum = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int nextNum = arr[j];

                if (currentNum <= nextNum) {
                    isTopInteger = false;
                    break;
                }
            }

            if (isTopInteger) {
                System.out.print(currentNum + " ");
            }
        }

        System.out.println(arr[arr.length - 1]);
    }
}
