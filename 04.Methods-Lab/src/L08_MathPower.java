import java.text.DecimalFormat;
import java.util.Scanner;

public class L08_MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int powerNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(MathPowerNumber(number, powerNumber)));
    }

    static double MathPowerNumber(double number, int powerNumber) {
        return Math.pow(number, powerNumber);
    }
}
