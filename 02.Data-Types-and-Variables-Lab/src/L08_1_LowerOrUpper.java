import java.util.Scanner;

public class L08_1_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        if (ch > 64 && ch < 91) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
