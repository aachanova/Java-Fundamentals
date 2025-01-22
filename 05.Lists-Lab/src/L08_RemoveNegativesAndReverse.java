import java.util.*;
import java.util.stream.Collectors;

public class L08_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(num -> num < 0);
        Collections.reverse(numbers);

//        numbers = numbers.stream()
//                .filter(num -> num >= 0)
//                .collect(Collectors.toList());
//
//        numbers = numbers.reversed();

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            numbers.forEach(num -> System.out.print(num + " "));
        }
    }
}
