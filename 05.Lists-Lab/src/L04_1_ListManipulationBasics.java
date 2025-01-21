import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L04_1_ListManipulationBasics {
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
                case "Add" -> numbers.add(Integer.parseInt(commandLine[1]));
                case "Remove" -> numbers.remove(Integer.valueOf(commandLine[1]));
                case "RemoveAt" -> numbers.remove(Integer.parseInt(commandLine[1]));
                case "Insert" -> {
                    Integer num = Integer.parseInt(commandLine[1]);
                    int index = Integer.parseInt(commandLine[2]);
                    numbers.add(index, num);
                }
            }

            input = scanner.nextLine();
        }

        numbers.forEach(num -> System.out.print(num + " "));
    }
}
