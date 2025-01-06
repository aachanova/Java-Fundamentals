import java.util.Scanner;

public class L07_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int output = -1;

        switch (dayType) {
            case "Weekday" -> {
                if (age >= 0 && age <= 18) {
                    output = 12;
                } else if (age > 18 && age <= 64) {
                    output = 18;
                } else if (age > 64 && age <= 122) {
                    output = 12;
                }
            }
            case "Weekend" -> {
                if (age >= 0 && age <= 18) {
                    output = 15;
                } else if (age > 18 && age <= 64) {
                    output = 20;
                } else if (age > 64 && age <= 122) {
                    output = 15;
                }
            }
            case "Holiday" -> {
                if (age >= 0 && age <= 18) {
                    output = 5;
                } else if (age > 18 && age <= 64) {
                    output = 12;
                } else if (age > 64 && age <= 122) {
                    output = 10;
                }
            }
        }

        if (output != -1) {
            System.out.printf("%d$", output);
        } else {
            System.out.println("Error!");
        }
    }
}
