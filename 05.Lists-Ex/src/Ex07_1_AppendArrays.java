import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex07_1_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> line = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        line
                .reversed()
                .forEach(n -> System.out.print(n.replaceAll("\\s+", " ") + " "));
    }
}
