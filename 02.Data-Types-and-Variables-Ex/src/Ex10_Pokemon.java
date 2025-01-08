import java.math.BigDecimal;
import java.util.Scanner;

public class Ex10_Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); // power
        int M = Integer.parseInt(scanner.nextLine()); // distance
        int Y = Integer.parseInt(scanner.nextLine()); // exhaustionFactor

        int targetsCount = 0;
        BigDecimal initalPower = new BigDecimal(N);
        BigDecimal halfPower = initalPower.divide(BigDecimal.valueOf(2));

        while (N >= M) {
            N -= M;
            targetsCount++;

            if (BigDecimal.valueOf(N).compareTo(halfPower) == 0) {
                if (Y != 0) {
                    N /= Y;
                }
            }
        }

        System.out.println(N);
        System.out.println(targetsCount);
    }

}

