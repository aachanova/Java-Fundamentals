package Ex04_Orders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Product> products = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] info = input.split("\\s");

            String name = info[0];
            double price = Double.parseDouble(info[1]);
            int quantity = Integer.parseInt(info[2]);

            if (products.containsKey(name)) {
                Product product = products.get(name);

                if (product.getPrice() != price) {
                    product.setPrice(price);
                }

                product.increaseQuantity(quantity);

            }

            products.putIfAbsent(name, new Product(price, quantity));
            input = scanner.nextLine();
        }

        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.calculateTotalPrice()));
    }


}
