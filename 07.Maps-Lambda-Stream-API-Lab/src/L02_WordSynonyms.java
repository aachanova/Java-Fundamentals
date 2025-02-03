import java.util.*;

public class L02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counts = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> dict = new LinkedHashMap<>();

        for (int i = 0; i < counts; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            dict.putIfAbsent(word, new ArrayList<>());
            dict.get(word).add(synonym);
        }

        dict.forEach((k, v) -> {
            System.out.printf("%s - %s%n", k, String.join(", ", v));
        });
    }
}
