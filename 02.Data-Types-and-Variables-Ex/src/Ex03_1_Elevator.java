import java.util.Scanner;

public class Ex03_1_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int result = (int) Math.ceil((double) people / capacity);
        System.out.println(result);
    }
}
