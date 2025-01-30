import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx02_1_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double firstTime = 0;
        double secondTime = 0;

        for (int i = 0; i < line.size() / 2; i++) {
            int current = line.get(i);
            firstTime += current;
            if (current == 0) {
                firstTime -= 0.20 * firstTime;
            }
        }

        for (int i = line.size() - 1; i > line.size() / 2; i--) {
            int current = line.get(i);
            secondTime += current;
            if (current == 0) {
                secondTime -= 0.20 * secondTime;
            }
        }

        String output = firstTime < secondTime
                ? String.format("The winner is left with total time: %.1f", firstTime)
                : String.format("The winner is right with total time: %.1f", secondTime);

        System.out.println(output);
    }
}
