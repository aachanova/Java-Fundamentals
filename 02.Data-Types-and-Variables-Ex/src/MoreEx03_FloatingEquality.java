import java.util.Scanner;

public class MoreEx03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        if (Math.abs(first - second) <= eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
