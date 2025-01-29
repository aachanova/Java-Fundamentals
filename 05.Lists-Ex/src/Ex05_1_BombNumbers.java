import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05_1_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombLine = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bomb = bombLine[0];
        int power = bombLine[1];

        while (numbers.contains(bomb)) {
            int start = Math.max(0, numbers.indexOf(bomb) - power);
            int end = Math.min(numbers.size() - 1, numbers.indexOf(bomb) + power);
            numbers.subList(start, end + 1).clear();
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
