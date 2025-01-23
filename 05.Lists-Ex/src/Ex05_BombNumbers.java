import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05_BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int bombIndex = scanner.nextInt();
        int bombPower = scanner.nextInt();

        while (numbers.contains(bombIndex)) {
            int endIndex = Math.min(numbers.indexOf(bombIndex) + bombPower, numbers.size() - 1);
            int startIndex = Math.max(0, numbers.indexOf(bombIndex) - bombPower);
            numbers.subList(startIndex, endIndex + 1).clear();
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
