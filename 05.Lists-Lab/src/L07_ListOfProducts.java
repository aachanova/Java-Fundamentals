import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L07_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s\n", i + 1, products.get(i));
        }
    }
}
