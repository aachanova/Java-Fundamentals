import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        Random random = new Random();

        for (int i = 0; i < words.length; i++) {
            int position = random.nextInt(words.length);
            String temp = words[i];
            words[i] = words[position];
            words[position] = temp;
        }

        Arrays.stream(words).forEach(System.out::println);
    }
}
