import java.util.Scanner;

public class L03_1_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        while (second.contains(first)) {
            second = second.replace(first, "");
        }

        System.out.println(second);
    }
}
