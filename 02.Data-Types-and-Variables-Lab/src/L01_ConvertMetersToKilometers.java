import java.util.Scanner;

public class L01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scanner.nextLine());
        double distanceInKm = distanceInMeters / 1000.0;

        System.out.printf("%.2f", distanceInKm);
    }
}
