import java.util.Scanner;

public class MoreEx02_FromLegtToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            long firstNum = Long.parseLong(line.split(" ")[0]);
            long secondNum = Long.parseLong(line.split(" ")[1]);

            long greaterNum = Math.abs(Math.max(firstNum, secondNum));
            long sum = 0;

            while (greaterNum > 0) {
                long lastDigit = greaterNum % 10;
                sum += lastDigit;
                greaterNum /= 10;
            }

            System.out.println(sum);
        }
    }
}
