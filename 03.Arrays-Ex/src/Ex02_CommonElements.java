import java.util.Scanner;

public class Ex02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (String text : arr2) {
            for (String txt : arr1) {
                if (text.equals(txt)) {
                    System.out.print(text + " ");
                }
            }
        }
    }
}
