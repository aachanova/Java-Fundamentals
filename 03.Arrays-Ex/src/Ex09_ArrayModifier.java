import java.util.Arrays;
import java.util.Scanner;

public class Ex09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "swap" -> {
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);

                    int temp = arr[firstIndex];
                    arr[firstIndex] = arr[secondIndex];
                    arr[secondIndex] = temp;
                }
                case "multiply" -> {
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);

                    arr[firstIndex] *= arr[secondIndex];
                }
                case "decrease" -> {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i]--;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);
        };
        System.out.println(arr[arr.length - 1]);
    }
}
