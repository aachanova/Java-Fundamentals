import java.util.Arrays;
import java.util.Scanner;

public class Ex06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean areEqual = false;

        if (arr.length == 1) {
            System.out.println("0");
        } else {
            int leftSum = 0;
            int rightSum = 0;

            for (int num : arr) {
                rightSum += num;
            }

            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    leftSum = 0;
                    rightSum -= arr[i];
                } else if (i == arr.length - 1) {
                    rightSum = 0;
                    leftSum += arr[i - 1];
                } else {
                    leftSum += arr[i - 1];
                    rightSum -= arr[i];
                }

                if (leftSum == rightSum) {
                    areEqual = true;
                    System.out.println(i);
                }
            }
            if (!areEqual) {
                System.out.println("no");
            }
        }
    }
}
