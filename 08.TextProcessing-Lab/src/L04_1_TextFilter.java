import java.util.Arrays;
import java.util.Scanner;

public class L04_1_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedList) {
            while (text.contains(word)) {
                text = text.replace(word, "*".repeat(word.length()));
            }
        }

        System.out.println(text);
    }
}
