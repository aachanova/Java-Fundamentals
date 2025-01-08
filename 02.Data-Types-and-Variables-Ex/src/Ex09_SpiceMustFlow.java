import java.util.Scanner;

public class Ex09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int nextDayAmount = 0;
        int totalAmount = 0;

        while ( amount >= 100) {
            days++;
            nextDayAmount = amount - 10;
            totalAmount += amount - 26;

            amount = nextDayAmount;
        }

        totalAmount -= 26;
        System.out.println(days);
        System.out.printf("%d", Math.max(0, totalAmount));
    }
}
