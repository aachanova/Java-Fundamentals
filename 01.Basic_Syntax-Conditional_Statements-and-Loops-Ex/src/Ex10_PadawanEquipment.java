import java.util.Scanner;

public class Ex10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double sabresSinglePrice = Double.parseDouble(scanner.nextLine());
        double robesSinglePrice = Double.parseDouble(scanner.nextLine());
        double beltsSinglePrice = Double.parseDouble(scanner.nextLine());

        double totalSabresPrice = Math.ceil(1.10 * studentsCount) * sabresSinglePrice;
        double totalRobesPrice = studentsCount * robesSinglePrice;
        int freeBelts = studentsCount / 6;
        double totalBeltsPrice = (studentsCount - freeBelts) * beltsSinglePrice;

        double totalPrice = totalSabresPrice + totalRobesPrice + totalBeltsPrice;

        if (totalPrice <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}
