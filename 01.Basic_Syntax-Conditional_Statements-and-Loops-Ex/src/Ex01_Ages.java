import java.util.Scanner;

public class Ex01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String output = "";

        if (age >= 0 && age <= 2) {
            output = "baby";
        } else if (age <= 13) {
            output = "child";
        } else if (age <= 19) {
            output = "teenager";
        } else if (age <= 65) {
            output = "adult";
        } else if (age >= 66) {
            output = "elder";
        }

        System.out.println(output);
    }
}