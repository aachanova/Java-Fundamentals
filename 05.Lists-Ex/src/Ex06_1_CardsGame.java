import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex06_1_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> deck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!deck1.isEmpty() && !deck2.isEmpty()) {
                int first = deck1.getFirst();
                int second = deck2.getFirst();
                if (first > second) {
                    deck1.add(deck1.removeFirst());
                    deck1.add(deck2.removeFirst());
                } else if (first < second) {
                    deck2.add(deck2.removeFirst());
                    deck2.add(deck1.removeFirst());
                } else {
                    deck1.removeFirst();
                    deck2.removeFirst();
                }
        }

        if (!deck1.isEmpty()) {
            System.out.printf("First player wins! Sum: %d", getSum(deck1));
        } else {
            System.out.printf("Second player wins! Sum: %d", getSum(deck2));
        }
    }

    private static int getSum(List<Integer> deck) {
        int sum = 0;
        for (Integer card : deck) {
            sum += card;
        }

        return sum;
    }
}
