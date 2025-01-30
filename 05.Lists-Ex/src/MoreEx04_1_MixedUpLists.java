import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx04_1_MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resulted = new ArrayList<>();

        while (!first.isEmpty() && !second.isEmpty()) {
            resulted.add(first.removeFirst());
            resulted.add(second.removeLast());
        }

        int start;
        int end;
        if (first.isEmpty()) {
            start = second.get(second.size() - 2);
            end = second.getLast();
        } else {
            start = first.get(first.size() - 2);
            end = first.getLast();
        }

                resulted.stream()
                .filter(n -> (n > start && n < end))
                .sorted()
                .collect(Collectors.toList())
                .forEach(n -> System.out.print(n + " "));
    }
}
