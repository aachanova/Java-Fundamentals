import java.util.Scanner;

public class L01_SignOfIntegerNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("The number %d is %s.", n, getSign(n));
    }

    static String getSign(int n) {
        String output;
        if (n > 0) {
            output = "positive";
        } else if (n < 0) {
            output = "negative";
        } else {
            output = "zero";
        }
        return output;
    }
}
