import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05_1_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Contains" -> {
                    int numToContain = Integer.parseInt(commandLine[1]);
                    if (numbers.contains(numToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                }
                case "Print" -> {
                    String numType = commandLine[1];
                    if (numType.equals("even")) {
                        for (Integer num : numbers) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }

                    } else if (numType.equals("odd")) {
                        for (Integer num : numbers) {
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                    }
                    System.out.println();
                }
                case "Get" -> {
                    int sum = numbers.stream().mapToInt(num -> num).sum();
                    System.out.println(sum);
                }
                case "Filter" -> {
                    String condition = commandLine[1];
                    int numToCompare = Integer.parseInt(commandLine[2]);

                    numbers.stream()
                            .filter(num -> applyCondition(num, condition, numToCompare))
                            .forEach(num -> System.out.print(num + " "));
                    System.out.println();
                }
            }

            input = scanner.nextLine();
        }
    }

    private static boolean applyCondition(Integer num, String condition, int numToCompare) {
        switch (condition) {
            case "<" -> {
                return num < numToCompare;
            }
            case ">" -> {
                return num > numToCompare;
            }
            case "<=" -> {
                return num <= numToCompare;
            }
            case ">=" -> {
                return num >= numToCompare;
            }
            default -> {
                return false;
            }
        }
    }
}
