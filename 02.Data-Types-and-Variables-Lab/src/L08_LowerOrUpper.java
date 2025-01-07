import java.util.Scanner;

public class L08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);

        String output = Character.isUpperCase(ch)
                ? "upper-case"
                : "lower-case";

        System.out.println(output);
    }
}
