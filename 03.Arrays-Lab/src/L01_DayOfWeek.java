import java.util.Scanner;

public class L01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayIndex = Integer.parseInt(scanner.nextLine());

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayIndex >= 1 && dayIndex <= 7) {
            System.out.println(week[dayIndex - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
