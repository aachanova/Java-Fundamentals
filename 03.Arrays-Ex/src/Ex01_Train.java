import java.util.Arrays;
import java.util.Scanner;

public class Ex01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagonsCount];

        for (int i = 0; i < wagonsCount; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }

        int peopleCount = 0;

        for (int peopleInWagon : train) {
            peopleCount += peopleInWagon;
            System.out.printf("%d ", peopleInWagon);
        }

        System.out.printf("%n%d",peopleCount);
    }
}
