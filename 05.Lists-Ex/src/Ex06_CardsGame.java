import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex06_CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!(first.isEmpty() || second.isEmpty())) {
            if (first.get(0) > second.get(0)) {
                first.add(first.get(0));
                first.add(second.get(0));
            } else if (first.get(0) < second.get(0)) {
                second.add(second.get(0));
                second.add(first.get(0));
            }
            first.remove(0);
            second.remove(0);
        }
        if (!first.isEmpty()) {
            System.out.println("First player wins! Sum: " + getSum(first));
        } else {
            System.out.println("Second player wins! Sum: " + getSum(second));
        }
    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
