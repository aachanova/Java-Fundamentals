import java.util.Scanner;

public class Ex07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int tankLitres = 0;

        for (int i = 0; i < n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (quantity > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                tankLitres += quantity;
                capacity -= quantity;
            }
        }

        System.out.println(tankLitres);
    }
}
