import java.util.Scanner;

public class MoreEx04_RiverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String text = scanner.nextLine();
        for (int i = text.length() - 1; i >= 0; i--) {
            char currentChar = text.charAt(i);
            sb.append(currentChar);
        }

        System.out.println(sb);
    }
}
