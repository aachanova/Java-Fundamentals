import java.util.Scanner;

public class L04_TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min += 30;

        if (min >= 60) {
            min -= 60;
            hour++;

            if (hour > 23) {
                hour = 0;
            }
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
