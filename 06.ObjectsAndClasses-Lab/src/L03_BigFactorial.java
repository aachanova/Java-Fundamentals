import java.math.BigInteger;
import java.util.Scanner;

public class L03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger(String.valueOf(num));

        for (int i = 2; i < num; i++) {
           factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }
}
