package Ex05_VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void printData() {
        if (this.type.equals("truck")) {
            System.out.println("Type: Truck");
        } else if (this.type.equals("car")) {
            System.out.println("Type: Car");
        }
        System.out.printf("Model: %s%n", this.model);
        System.out.printf("Color: %s%n", this.color);
        System.out.printf("Horsepower: %d%n", this.horsepower);
    }
}
