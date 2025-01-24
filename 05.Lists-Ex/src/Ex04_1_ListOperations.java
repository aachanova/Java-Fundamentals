import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04_1_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandLine = input.split("\\s+");
            String command = commandLine[0];
            switch (command) {
                case "Add" -> numbers.add(Integer.parseInt(commandLine[1]));

                case "Insert" -> {
                    int index = Integer.parseInt(commandLine[2]);
                    if (isValidIndex(index, numbers.size())) {
                        numbers.add(index, Integer.parseInt(commandLine[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                }

                case "Remove" -> {
                    int index = Integer.parseInt(commandLine[1]);
                    if (isValidIndex(index, numbers.size())) {
                        numbers.remove(Integer.parseInt(commandLine[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                }

                case "Shift" -> {
                    String direction = commandLine[1];
                    int count = Integer.parseInt(commandLine[2]);

                    for (int i = 0; i < count; i++) {
                        if (direction.equals("left")) {
                            numbers.add(numbers.removeFirst());
                        } else {
                            numbers.addFirst(numbers.removeLast());
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }

        numbers.forEach(n -> System.out.print(n + " "));
    }

    private static boolean isValidIndex(int index, int size) {
        return index >= 0 && index < size;
    }
}
