import java.util.Scanner;

public class L01_1_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder sb = new StringBuilder(input);
            System.out.printf("%s = %s%n", input, sb.reverse());

            input = scanner.nextLine();
        }
    }
}
