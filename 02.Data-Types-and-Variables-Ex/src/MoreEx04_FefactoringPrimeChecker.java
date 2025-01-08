import java.util.Scanner;

public class MoreEx04_FefactoringPrimeChecker {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//        for (int takoa = 2; takoa <= n; takoa++) {
//            boolean takovalie = true;
//            for (int cepitel = 2; cepitel < takoa; cepitel++) {
//                if (takoa % cepitel == 0) {
//                    takovalie = false;
//                    break;
//                }
//            }
//            System.out.printf("%d -> %b%n", takoa, takovalie);
//        }

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.printf("%d -> %b%n", num, isPrime);
        }
    }
}
