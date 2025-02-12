import java.util.Arrays;
import java.util.Scanner;

public class L02_1_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();

        Arrays.stream(input)
                .forEach(e -> sb.repeat(e, e.length()));

        System.out.println(sb);
    }
}
