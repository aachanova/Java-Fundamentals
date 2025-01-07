import java.util.Scanner;

public class Ex11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double brokenHeadsets = lost / 2;
        double brokenMouses = lost / 3;
        double brokenKeyboards = lost / 6;
        double brokenDisplays = lost / 12;

        double totalExpenses = brokenHeadsets * headsetPrice + brokenMouses * mousePrice + brokenKeyboards * keyboardPrice + brokenDisplays * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
