package Ex05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        // Четене на вход за превозни средства
        while (!input.equals("End")) {
            String[] info = input.split("\\s+");
            vehicles.add(new Vehicle(info[0], info[1], info[2], Integer.parseInt(info[3])));
            input = scanner.nextLine();
        }

        // Четене на запитвания за модели
        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            final String finalModel = model;
            vehicles.stream()
                    .filter(v -> v.getModel().equals(finalModel))  // филтрираме по модел
                    .forEach(Vehicle::printData);  // извикваме printData без параметър

            model = scanner.nextLine();
        }
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//        List<Vehicle> vehicles = new ArrayList<>();
//
//        while (!input.equals("End")) {
//            String[] info = scanner.nextLine().split("\\s+");
//            vehicles.add(new Vehicle(info[0], info[1], info[2], Integer.parseInt(info[3])));
//
//            input = scanner.nextLine();
//        }
//
//        String model = scanner.nextLine();
//
//        while (!model.equals("Close the Catalogue")) {
//            vehicles.stream()
//                    .filter(v -> v.getModel().equals(model))
//                    .forEach(v -> v.printData(model));
//
//            model = scanner.nextLine();
//        }
//    }
}
