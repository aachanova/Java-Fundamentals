import java.util.Scanner;

public class L03_Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        StringBuilder output = new StringBuilder(scanner.nextLine());
        int index;

        while ((index = output.indexOf(key)) != -1) {
            output.delete(index, index + key.length());
        }
        System.out.println(output);
    }
}
