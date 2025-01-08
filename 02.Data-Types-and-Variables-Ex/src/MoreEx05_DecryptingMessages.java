import java.util.Scanner;

public class MoreEx05_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int symbolsCount = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < symbolsCount; i++) {
            char letter = scanner.next().charAt(0);
            output.append((char) (letter + key));
        }
        System.out.println(output);
    }
}
