import java.util.Scanner;

public class L05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.print(name1 + delimeter + name2);
    }
}
