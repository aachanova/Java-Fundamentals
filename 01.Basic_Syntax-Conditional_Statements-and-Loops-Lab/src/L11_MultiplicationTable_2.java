import java.util.Scanner;

public class L11_MultiplicationTable_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        for (int i = multiplier; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num * i);
        }

        if (multiplier > 10) {
            System.out.printf("%d X %d = %d", num, multiplier, num * multiplier);
        }
    }
}
