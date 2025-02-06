import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L04_1_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> words = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        Arrays.stream(input)
                .forEach(w -> words.put(w, w.length()));

        words.entrySet().stream()
                .filter(e -> e.getValue() % 2 == 0)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
