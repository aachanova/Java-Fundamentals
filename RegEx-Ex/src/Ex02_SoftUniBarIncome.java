import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02_SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^$%|.]*<(?<product>\\w+)>[^$%|.]*\\|(?<quantity>\\d+)\\|[^$%|.]*?(?<price>\\d+\\.?\\d+)\\$");
        String input;
        double sum = 0;

        while (!"end of shift".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double totalPrice = Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"), matcher.group("product"), totalPrice);
                sum += totalPrice;
            }
        }
        System.out.printf("Total income: %.2f", sum);
    }
}
