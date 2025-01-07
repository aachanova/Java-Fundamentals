import java.util.Scanner;

public class L12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int number = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//        int temp = 0;
//        boolean isSpecialNumber = false;
//        for (int ch = 1; ch <= number; ch++) {
//            temp = ch;
//            while (ch > 0) {
//                sum += ch % 10;
//                ch = ch / 10;
//            }
//            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
//            System.out.printf("%d -> %b%n", temp, isSpecialNumber);
//            sum = 0;
//            ch = temp;

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int temp = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            boolean isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);

            if (isSpecialNumber) {
                System.out.printf("%d -> True%n", temp);
            } else {
                System.out.printf("%d -> False%n", temp);
            }

            i = temp;
        }
    }
}