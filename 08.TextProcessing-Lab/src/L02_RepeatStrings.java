import java.util.Scanner;

public class L02_RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String s : input) {
            result.append(s.repeat(s.length()));
        }
        System.out.println(result);
    }
}
