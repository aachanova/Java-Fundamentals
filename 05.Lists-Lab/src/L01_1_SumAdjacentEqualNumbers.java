import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01_1_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        final double EPSILON = 0.0001;

        for (int i = 0; i < numbers.size() - 1; i++) {
            Double current = numbers.get(i);
            Double next = numbers.get(i + 1);

            if (Math.abs(current - next) < EPSILON) {
                numbers.set(i, current + next);
                numbers.remove(i + 1);
                i = -1;
            }
        }

        String output = joinElementsByDelimiter(numbers);
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> items) {
        StringBuilder sb = new StringBuilder();
        for (Double item : items) {
            sb.append(new DecimalFormat("0.#").format(item)).append(" ");
        }

        return sb.toString();
    }
}
