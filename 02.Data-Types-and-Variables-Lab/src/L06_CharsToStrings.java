import java.util.Scanner;

public class L06_CharsToStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", ch1, ch2, ch3);
    }
}
