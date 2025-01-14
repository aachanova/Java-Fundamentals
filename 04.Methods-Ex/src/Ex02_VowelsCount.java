import java.util.Scanner;

public class Ex02_VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printCountOfVowels(input);
    }

    private static void printCountOfVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            if (next == 'a' || next == 'o' || next == 'e' || next == 'u' || next == 'i' || next == 'A'
                    || next == 'E' || next == 'O' || next == 'U' || next == 'I') {
                count++;
            }
        }
        System.out.println(count);
    }
}
