import java.util.Scanner;

public class Ex03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;

        switch (type) {
            case "Students" -> {
                switch (day) {
                    case "Friday" -> price = 8.45;
                    case "Saturday" -> price = 9.80;
                    case "Sunday" -> price = 10.46;
                }
            }
            case "Business" -> {
                switch (day) {
                    case "Friday" -> price = 10.90;
                    case "Saturday" -> price = 15.60;
                    case "Sunday" -> price = 16.00;
                }
            }
            case "Regular" -> {
                switch (day) {
                    case "Friday" -> price = 15.00;
                    case "Saturday" -> price = 20.00;
                    case "Sunday" -> price = 22.50;
                }
            }
        }

        double totalPrice = peopleCount * price;

        if (type.equals("Students") && peopleCount >= 30) {
            totalPrice -= 0.15 * totalPrice;
        }

        if (type.equals("Business") && peopleCount >= 100) {
            totalPrice = (peopleCount - 10) * price;
        }

        if (type.equals("Regular") && (peopleCount >= 10 && peopleCount <= 20)) {
            totalPrice -= 0.05 * totalPrice;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
