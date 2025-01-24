import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01_1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");
            if (commandLine[0].equals("Add")) {
                train.add(Integer.parseInt(commandLine[1]));
            } else {
                int passengers = Integer.parseInt(commandLine[0]);
                for (int wagon = 0; wagon < train.size(); wagon++) {
                    int freeSeats = maxCapacity - train.get(wagon);

                    if (freeSeats >= passengers) {
                        train.set(wagon, train.get(wagon) + passengers);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        train.forEach(w -> System.out.print(w + " "));
    }
}
