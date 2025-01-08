import java.util.Scanner;

public class Ex11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballsCount = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = 0;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 0; i < snowballsCount; i++) {
            snow = Integer.parseInt(scanner.nextLine());
            time = Integer.parseInt(scanner.nextLine());
            quality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow((double) snow /time, quality);

            if (value > maxSnowballValue) {
                maxSnowballValue = value;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxSnowballValue, maxQuality);
    }
}
