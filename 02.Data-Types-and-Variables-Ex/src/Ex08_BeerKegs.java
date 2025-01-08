import java.util.Scanner;

public class Ex08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegsCount = Integer.parseInt(scanner.nextLine());
        String biggest = "";
        double maxVolume = Double.MIN_VALUE;

        for (int i = 0; i < kegsCount; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                biggest = model;
            }
        }

        System.out.println(biggest);
    }
}
