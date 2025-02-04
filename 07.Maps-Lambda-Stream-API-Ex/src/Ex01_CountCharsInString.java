import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01_CountCharsInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> output = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (key != 32) {
                output.put(key, !output.containsKey(key) ? 1 : output.get(key) + 1);
            }
        }
        output.forEach((key, value) -> System.out.printf("%c -> %d%n", key, value));
    }
}
