import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01_1_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> symbols = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(w -> {
                    for (int i = 0; i < w.length(); i++) {
                        symbols.putIfAbsent(w.charAt(i), 0);
                        symbols.put(w.charAt(i), symbols.get(w.charAt(i)) + 1);
                    }
                });

        symbols.forEach((k, v) -> System.out.printf("%c -> %d%n", k, v));
    }
}
