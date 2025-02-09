import java.util.Scanner;

public class L01_ReverseStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        System.out.println(input.reverse());
    }
}
