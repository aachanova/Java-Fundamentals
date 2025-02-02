package Ex05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String[] info = input.split("\\s+");
            vehicles.add(new Vehicle(info[0], info[1], info[2], Integer.parseInt(info[3])));

            input = scanner.nextLine();
        }

        String model = scanner.nextLine();

        while (!model.equals("Close the Catalogue")) {
            final String finalModel = model;
            vehicles.stream()
                    .filter(v -> v.getModel().equals(finalModel))
                    .forEach(v -> v.printData());

            model = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", getCarAverageHorsepower(vehicles));
        System.out.printf("Trucks have average horsepower of: %.2f.", getTruckAverageHorsepower(vehicles));
    }

    private static double getCarAverageHorsepower(List<Vehicle> vehicles) {
        double avgCarHorsepower = vehicles.stream()
                .filter(v -> v.getType().equals("car"))
                .mapToInt(Vehicle::getHorsepower)
                .average()
                .orElse(0.00);

        return avgCarHorsepower;
    }

    private static double getTruckAverageHorsepower(List<Vehicle> vehicles) {
        double avgTruckHorsepower = vehicles.stream()
                .filter(v -> v.getType().equals("truck"))
                .mapToInt(Vehicle::getHorsepower)
                .average()
                .orElse(0.00);

        return avgTruckHorsepower;
    }
}
