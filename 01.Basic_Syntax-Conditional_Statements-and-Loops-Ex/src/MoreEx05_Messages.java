import java.util.Scanner;

public class MoreEx05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lettersCount = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lettersCount; i++) {
            String input = scanner.nextLine();
            char letter = 0;

            switch (input) {
                case "0" -> letter = ' ';
                case "2" -> letter = 'a';
                case "22" -> letter = 'b';
                case "222" -> letter = 'c';
                case "3" -> letter = 'd';
                case "33" -> letter = 'e';
                case "333" -> letter = 'f';
                case "4" -> letter = 'g';
                case "44" -> letter = 'h';
                case "444" -> letter = 'i';
                case "5" -> letter = 'j';
                case "55" -> letter = 'k';
                case "555" -> letter = 'l';
                case "6" -> letter = 'm';
                case "66" -> letter = 'n';
                case "666" -> letter = 'o';
                case "7" -> letter = 'p';
                case "77" -> letter = 'q';
                case "777" -> letter = 'r';
                case "7777" -> letter = 's';
                case "8" -> letter = 't';
                case "88" -> letter = 'u';
                case "888" -> letter = 'v';
                case "9" -> letter = 'w';
                case "99" -> letter = 'x';
                case "999" -> letter = 'y';
                case "9999" -> letter = 'z';
            }

            sb.append(letter);
        }

        System.out.println(sb);
    }
}
