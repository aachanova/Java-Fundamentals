import java.util.Scanner;

public class L05_1_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char ch : input) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                others.append(ch);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
