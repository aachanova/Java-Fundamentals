import java.util.Scanner;

public class Ex06_MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printTheMiddleCharacter(input);
    }

    private static void printTheMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
            System.out.println(input.charAt(input.length() / 2 - 1) + "" + input.charAt(input.length() / 2));
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}
