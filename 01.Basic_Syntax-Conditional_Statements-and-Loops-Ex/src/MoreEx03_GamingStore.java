import java.util.Scanner;

public class MoreEx03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double initalBalance = balance;
        String input = scanner.nextLine();


        while (!input.equals("Game Time")) {
            String game = input;
            double price = 0;

            switch (game) {
                case "OutFall 4" -> price = 39.99;
                case "CS: OG" -> price = 15.99;
                case "Zplinter Zell" -> price = 19.99;
                case "Honored 2" -> price = 59.99;
                case "RoverWatch" -> price = 29.99;
                case "RoverWatch Origins Edition" -> price = 39.99;
                default -> {
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
                }
            }

            if (price <= balance) {
                System.out.printf("Bought %s%n", game);
                balance -= price;

                if (balance == 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else {
                System.out.println("Too Expensive");
            }

            input = scanner.nextLine();
        }

        if (balance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", initalBalance - balance, balance);
        }
    }
}
