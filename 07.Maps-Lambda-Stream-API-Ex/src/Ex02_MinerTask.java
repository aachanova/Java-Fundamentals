import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            String resource = input;
            Integer quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(resource, 0);
            resources.put(resource, resources.get(resource) + quantity);

            input = scanner.nextLine();
        }

        resources.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));
    }
}
