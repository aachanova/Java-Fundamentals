import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L02_1_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int length = numbers.size() / 2;

        for (int i = 0; i < length; i++) {
            Integer current = numbers.get(i);
            Integer last = numbers.getLast(); // numbers.get(numbers.size() - 1);

            numbers.set(i, current + last);
            numbers.remove(last);
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
