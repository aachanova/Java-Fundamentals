import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03_1_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().toLowerCase().split("\\s+");

        Map<String, Integer> words = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            words.putIfAbsent(word, 0);
            words.put(word, words.get(word) + 1);
        }

        String result = words.entrySet().stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
