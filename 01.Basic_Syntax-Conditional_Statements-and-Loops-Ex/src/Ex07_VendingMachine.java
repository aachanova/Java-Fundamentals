import java.util.Scanner;

public class Ex07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);

            if (coin == 0.1) {
                sum += 0.1;
            } else if (coin == 0.2) {
                sum += 0.2;
            } else if (coin == 0.5) {
                sum += 0.5;
            } else if (coin == 1) {
                sum += 1;
            } else if (coin == 2) {
                sum += 2;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }

            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double price = 0.0;

        while (!product.equals("End")) {
            switch (product) {
                case "Nuts" -> price = 2.0;
                case "Water" -> price = 0.7;
                case "Crisps" -> price = 1.5;
                case "Soda" -> price = 0.8;
                case "Coke" -> price = 1.0;
                default -> {
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
                    continue;
                }
            }

            if (price > sum) {
                System.out.println("Sorry, not enough money");
            } else {
                sum -= price;
                System.out.printf("Purchased %s%n", product);
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
