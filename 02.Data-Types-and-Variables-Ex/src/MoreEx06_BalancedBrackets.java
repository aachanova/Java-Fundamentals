import java.util.Scanner;

public class MoreEx06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isOpen = false;
        boolean isBalanced = true;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if ((isOpen && input.equals("(")) || (!isOpen && input.equals(")"))) {
                isBalanced = false;
                break;
            }

            if (input.equals("(")) {
                isOpen = true;
            } else if (input.equals(")")) {
                isOpen = false;
            }
        }

        if (!isBalanced || isOpen) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
